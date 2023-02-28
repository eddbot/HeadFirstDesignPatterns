package src.PizzaStores;

import src.Pizzas.NYCheeseHam;
import src.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case "CheeseHam":
                return new NYCheeseHam();
            default:
                throw new IllegalArgumentException();
        }
    }
}
