package src.Ingredients;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }
}
