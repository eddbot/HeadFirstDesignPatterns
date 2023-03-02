package src.Pizzas;

import src.Ingredients.PizzaIngredientFactory;

public class NYCheeseHam extends Pizza {

    public NYCheeseHam(PizzaIngredientFactory pizzaIngredientFactory) {
        this.cheese = pizzaIngredientFactory.createCheese();
    }
}
