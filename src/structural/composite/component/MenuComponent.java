package structural.composite.component;

import java.util.Iterator;

// 일부 메소드는 MenuItem 에서만 사용 가능하고 또 다른 메소드는 Menu 에서만 사용 가능 하다
// 모든 메소드가 기본적으로 UnsupportedOperationException 을 던지도록 구현하여 필요한 메소드만 오버라이드 하여 사용
public abstract class MenuComponent {

    // MenuComponent 를 추가 및 제거 하고 가져 오기 위한 메소드
    public void add (MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove (MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // MenuItem 에서 작업을 처리하기 위해 사용하는 메소드.
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // print 메소드는 Menu 와 MenuItem 모두 구현하는 작업용 메소드
    public void print() {
        throw new UnsupportedOperationException();
    }

    // iterator 의 활용
    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
