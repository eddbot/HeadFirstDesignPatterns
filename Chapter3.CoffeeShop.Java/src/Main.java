import Beverages.Beverage;
import Beverages.DarkRoast;
import Beverages.Espresso;
import Beverages.HouseBlend;
import Condiments.Mocha;
import Condiments.Soy;
import Condiments.Whip;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        // Let's format the cost to something nicer
        DecimalFormat df = new DecimalFormat("#.00");

        // Boring coffee again
        Beverage houseBlend = new HouseBlend();
        String output = String.format("%s, costs $%s", houseBlend.getDescription(),df.format(houseBlend.cost()));
        System.out.println(output);

        // Lets make a mocha!
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        output = String.format("%s, costs $%s", darkRoast.getDescription(),df.format(darkRoast.cost()));
        System.out.println(output);

        // Lets try a... SoySpresso? :lol
        Beverage espresso = new Espresso();
        espresso = new Soy(espresso);

        output = String.format("%s, costs $%s", espresso.getDescription(),df.format(espresso.cost()));
        System.out.println(output);






    }
}