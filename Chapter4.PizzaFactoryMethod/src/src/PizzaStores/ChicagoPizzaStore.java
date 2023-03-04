package src.PizzaStores;

import src.Pizzas.ChicagoCheeseHam;
import src.Pizzas.ChicagoMeatFeast;
import src.Pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheeseAndHam" -> new ChicagoCheeseHam();
            case "meatFeast" -> new ChicagoMeatFeast();
            default -> throw new IllegalArgumentException("Wots that pizza?");
        };
    }
}