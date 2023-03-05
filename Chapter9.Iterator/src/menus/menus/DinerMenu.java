package menus.menus;

import src.Interfaces.DinerMenuIterator;
import src.Interfaces.Iterator;

public class DinerMenu {

    private final int MAX_SIZE = 6;
    private int currentItem = 0;
    private final MenuItem[] menuItems = new MenuItem[MAX_SIZE];

    public DinerMenu() {
        for (int i = 0; i < MAX_SIZE; i++) {
            this.menuItems[i] = new MenuItem(
                    "Menu Item number" + i,
                    "They are all the same lol",
                    i,
                    i % 2 == 0);
            currentItem++;
        }
    }

    public void addMenuItem(MenuItem menuItem) {
        if (currentItem >= MAX_SIZE) {
            System.out.println("Too many menu items!");
            return;
        }
        menuItems[currentItem] = menuItem;
        currentItem++;
    }

    public Iterator getIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}
