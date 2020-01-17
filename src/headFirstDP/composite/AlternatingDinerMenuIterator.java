package headFirstDP.composite;

import headFirstDP.iterator.MenuItem;

import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar righNow = Calendar.getInstance();
        position = righNow.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position+2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove()는 지원하지 않습니다.");
    }
}
