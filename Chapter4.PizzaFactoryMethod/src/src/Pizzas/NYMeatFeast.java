package src.Pizzas;

import src.Ingredients.PizzaIngredientFactory;

public class NYMeatFeast extends Pizza {

    public NYMeatFeast(PizzaIngredientFactory pizzaIngredientFactory) {
        this.cheese = pizzaIngredientFactory.createCheese();
    }
}
