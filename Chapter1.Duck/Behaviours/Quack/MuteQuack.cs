namespace Chapter1.Duck;

public class MuteQuack : IQuackBehaviour
{
    public void Quack()
    {
       Console.WriteLine("__no noise__"); 
    }
}