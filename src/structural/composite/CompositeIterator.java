package structural.composite;

import java.util.Iterator;
import java.util.Stack;

// 복합 객체 안에 들어있는 MenuItem 에 대해 반복 작업을 할 수 있게 해주는 기능을 제공.
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    // 반복 작업을 처리할 대상 중 최상위 복합 객체의 반복자가 전달된다. 해당 반복자를 스택에 push
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            // 스택에 반복자가 있다면 해당 반복자의 다음 원소를 구한다.
            MenuComponent component = (MenuComponent) iterator.next();
            // 해당 원소가 복합 객체일땐 복합 객체의 반복자를 스택에 push
            if(component instanceof  Menu) {
                stack.push (component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            // 스택이 비어있지 않다면 스택 맨 위에서 반복자를 꺼내어 다음 원소가 있는지 확인
            Iterator iterator = (Iterator) stack.peek();
            // 다음 원소가 없다면 해당 반복자를 스택에서 뽑아 내고 다른 반복자가 있는지 재귀적으로 호출
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                // 다음 원소가 있다.
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
