namespace Chapter3.CoffeeShop.Models;

public class Mocha : CondimentDecorator
{
    public Mocha(Beverage beverage)
    {
        _beverage = beverage;
    }


    public override double Cost()
    {
        var price = 0.20;

        var cost = _beverage.GetSize() switch
        {
            Size.Tall => price - (price / 3),
            Size.Grande => price,
            Size.Venti => price + (price / 3),
            _ => throw new ArgumentOutOfRangeException()
        };

        return _beverage.Cost() + cost;
    }

// public override double Cost() => _beverage.Cost() + 0.20;
    public override string GetDescription() => _beverage.GetDescription() + ", Mocha";
}