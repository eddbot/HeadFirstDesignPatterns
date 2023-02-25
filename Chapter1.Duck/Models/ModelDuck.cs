namespace Chapter1.Duck;

public class ModelDuck : global::Duck
{
    public ModelDuck()
    {
        _quackBehaviour = new MuteQuack();
        _flyBehaviour = new FlyNoWay();
    }

    public override void Display()
    {
        Console.WriteLine("I'm a model duck innit");
    }
}