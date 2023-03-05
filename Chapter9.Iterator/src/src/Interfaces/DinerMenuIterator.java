package src.Interfaces;

import menus.menus.MenuItem;

public class DinerMenuIterator implements Iterator {
    private final MenuItem[] menuItems;
    private int index = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public boolean hasNext() {
        return index < menuItems.length;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }
}
