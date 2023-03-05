import menus.menus.DinerMenu;
import menus.menus.BreakfastMenu;
import src.Interfaces.Iterator;

public class Main {
    public static void main(String[] args) {
        DinerMenu dinnerMenu = new DinerMenu();

        Iterator dinerMenuIterator = dinnerMenu.getIterator();

        while (dinerMenuIterator.hasNext()) {
            System.out.println(dinerMenuIterator.next().name());
        }


        BreakfastMenu breakfastMenu = new BreakfastMenu();

        Iterator breakfastMenuIterator = breakfastMenu.getIterator();

        while (breakfastMenuIterator.hasNext()) {
            System.out.println(breakfastMenuIterator.next().name());
        }

    }
}