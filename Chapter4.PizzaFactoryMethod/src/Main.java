import src.PizzaStores.NYPizzaStore;
import src.PizzaStores.PizzaStore;
import src.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheeseAndHam");
        System.out.println(pizza);
    }
}