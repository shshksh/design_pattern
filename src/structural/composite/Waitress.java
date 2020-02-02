package structural.composite;

import behavioral.iterator.Menu;
import behavioral.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
/*    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }*/

        MenuComponent allMenus;

        public Waitress(MenuComponent allMenus) {
            this.allMenus = allMenus;
        }

        public void printMenu() {
            allMenus.print();
        }

/*
    // allMenus 의 반복자를 받아서 사용
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) { // 복합 객체 내의 모든 항목에 대해서 반복 작업을 수행
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if(menuComponent.isVegetarian()){ // 채식주의자용 메뉴일때 해당 메뉴를 출력
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignored) {} //
        }
    }
*/

}
