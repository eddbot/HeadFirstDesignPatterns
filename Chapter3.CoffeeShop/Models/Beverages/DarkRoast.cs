namespace Chapter3.CoffeeShop.Models;

public class DarkRoast : Beverage
{
    public DarkRoast()
    {
        _description = "Dark Roast";
    }
    public override double Cost() => 0.99;
}