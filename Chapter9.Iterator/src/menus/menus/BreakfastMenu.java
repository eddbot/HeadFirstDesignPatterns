package menus.menus;

import src.Interfaces.BreakfastMenuIterator;
import src.Interfaces.Iterator;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class BreakfastMenu {
    private final ArrayList<MenuItem> menuItems = new ArrayList<>();

    public BreakfastMenu() {

        IntStream.range(0, 5).forEach(i -> this.menuItems.add(
                        new MenuItem(
                                "Breakfast item " + i,
                                "All the same heh",
                                i,
                                i % 2 == 0
                        )
                )
        );
    }

    public Iterator getIterator() {
        return new BreakfastMenuIterator(this.menuItems);
    }
}
