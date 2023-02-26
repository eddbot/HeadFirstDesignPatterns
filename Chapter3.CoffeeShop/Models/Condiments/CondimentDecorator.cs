namespace Chapter3.CoffeeShop.Models;

public abstract class CondimentDecorator : Beverage
{
    protected Beverage _beverage = null!;
    


    public abstract override string GetDescription();

    public override Size GetSize() => _beverage.GetSize();
}