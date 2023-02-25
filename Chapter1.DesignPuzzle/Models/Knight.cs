namespace Chapter1.DesignPuzzle.Models;

public class Knight : Character
{
    public override void Fight()
    {
        if (WeaponBehaviour is not null)
        {
            Console.WriteLine($"Heroically the knight fights, {WeaponBehaviour.UseWeapon()}");
        }
        else
        {
            throw new ArgumentNullException();
        }
    }

}