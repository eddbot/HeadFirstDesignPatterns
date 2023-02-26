namespace Chapter3.CoffeeShop.Models;

public abstract class Beverage
{
    public enum Size
    {
        Tall, Grande, Venti
    }

    private Size _size = Size.Tall;
    protected string _description = "Unknown Beverage";
    public virtual string GetDescription() => _description;
    public abstract double Cost();
    public void SetSize(Size size) => _size = size;
    public virtual Size GetSize() => _size;
}