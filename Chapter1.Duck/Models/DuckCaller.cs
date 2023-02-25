namespace Chapter1.Duck;

public class DuckCaller
{
    private readonly IQuackBehaviour _quackBehaviour;

    public DuckCaller(IQuackBehaviour quackBehaviour)
    {
        _quackBehaviour = quackBehaviour;
    }

    public void MatingCall()
    {
        _quackBehaviour.Quack();
    }
}