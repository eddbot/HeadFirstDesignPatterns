namespace Chapter3.CoffeeShop.Models;

public class Espresso : Beverage
{
    public Espresso()
    {
        _description = "Espresso";
    }
    public override double Cost() => 1.99;
}