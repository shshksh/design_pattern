package behavioral.iterator.concreteiterator;

import behavioral.iterator.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    @Override
    public boolean hasNext() {
        return (position < list.length) && (list[position] != null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if(position <= 0) {
            throw new IllegalStateException("next()를 한 번도 호출하지 않은 상태에서는 삭제할 수 없습니다.");
        }
        if(list[position-1] != null) {
            for (int i = position-1; i < list.length-1; i++) {
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
    }
}
