package headFirstDP.iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();

        System.out.println("메뉴\n----\n아침 식사");
        printMenu(pancakeIterator);
        System.out.println("\n점심 식사");
        printMenu(dinerIterator);
        System.out.println("\n저녁 식사");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
