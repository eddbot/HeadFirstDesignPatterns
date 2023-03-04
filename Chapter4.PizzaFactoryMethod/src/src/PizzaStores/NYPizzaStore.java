package src.PizzaStores;

import src.Ingredients.NYPizzaIngredientFactory;
import src.Ingredients.PizzaIngredientFactory;
import src.Pizzas.NYCheeseHam;
import src.Pizzas.NYMeatFeast;
import src.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        return switch (type) {
            case "cheeseAndHam" -> new NYCheeseHam(pizzaIngredientFactory);
            case "meatFeast" -> new NYMeatFeast(pizzaIngredientFactory);
            default -> throw new IllegalArgumentException("Wots that pizza?");
        };
    }
}
