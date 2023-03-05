package src.Interfaces;

import menus.menus.MenuItem;

import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator {

    private final ArrayList<MenuItem> menu;
    private int index = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        return index < menu.size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = menu.get(index);
        index++;
        return item;
    }
}
