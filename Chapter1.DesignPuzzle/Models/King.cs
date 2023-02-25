namespace Chapter1.DesignPuzzle.Models;

public class King : Character
{
    public override void Fight()
    {
        if (WeaponBehaviour is not null)
        {
            Console.WriteLine($"Majestically the king fights, {WeaponBehaviour.UseWeapon()}");
        }
        else
        {
            throw new ArgumentNullException();
        }
    }

}