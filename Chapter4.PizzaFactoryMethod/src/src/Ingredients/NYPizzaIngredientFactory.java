package src.Ingredients;

public class NYPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }
}
