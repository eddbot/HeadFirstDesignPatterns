namespace Chapter1.DesignPuzzle.Models;

public class Troll : Character
{
    public override void Fight()
    {
        if (WeaponBehaviour is not null)
        {
            Console.WriteLine($"Rawwr the troll fights, {WeaponBehaviour.UseWeapon()}");
        }
        else
        {
            throw new ArgumentNullException();
        }
    }

}