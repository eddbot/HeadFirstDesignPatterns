package src.PizzaStores;

import src.Pizzas.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);
        pizza.addToppings();
        pizza.bake();
        pizza.slice();

        return pizza;
    }
}
