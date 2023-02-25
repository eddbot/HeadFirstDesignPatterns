namespace Chapter1.Duck;

public class FlyNoWay : IFlyBehaviour
{
    public void Fly()
    {
       Console.WriteLine("I can't fly :("); 
    }
}