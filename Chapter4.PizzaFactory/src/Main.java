import src.PizzaStores.NYPizzaStore;
import src.Pizzas.Pizza;
import src.PizzaStores.PizzaStore;

public class Main {
    public static void main(String[] args) {

        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("CheeseHam");

    }
}