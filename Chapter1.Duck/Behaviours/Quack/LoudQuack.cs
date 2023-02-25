namespace Chapter1.Duck;

public class LoudQuack : IQuackBehaviour
{
    public void Quack()
    {
       Console.WriteLine("QUAAACK QUACK!"); 
    }
}