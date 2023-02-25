using Chapter1.Duck;

public class Duck
{
    internal IFlyBehaviour? _flyBehaviour;
    internal  IQuackBehaviour? _quackBehaviour;

    protected Duck(){}

    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour)
    {
        _flyBehaviour = flyBehaviour;
        _quackBehaviour = quackBehaviour;
    }

    public void SetFlyBehaviour(IFlyBehaviour flyBehaviour)
    {
        _flyBehaviour = flyBehaviour;
    }

    public void SetQuackBehaviour(IQuackBehaviour quackBehaviour)
    {
        _quackBehaviour = quackBehaviour;
    }
    public void PerformFly()
    {
        if (_flyBehaviour is not null)
        {
            _flyBehaviour.Fly();
        }
    }

    public void PerformQuack()
    {
        if (_quackBehaviour is not null)
        {
            _quackBehaviour.Quack();
        }
    }

    public void Swim()
    {
        Console.WriteLine($"{this} is swimming!");
    }

    public void Display()
    {
    }
    
}