namespace Chapter1.Duck;

public class MallardDuck : global::Duck
{
    public MallardDuck()
    {
        _quackBehaviour = new LoudQuack();
        _flyBehaviour = new FlyWithWings();
    }

    public override void Display()
    {
       Console.WriteLine($"I'm a real Mallard Duck!"); 
    }
}