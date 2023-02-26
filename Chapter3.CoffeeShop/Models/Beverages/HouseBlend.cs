namespace Chapter3.CoffeeShop.Models;

public class HouseBlend : Beverage
{
    public HouseBlend()
    {
        _description = "House Blend";
    }
    public override double Cost() => 0.89;
}