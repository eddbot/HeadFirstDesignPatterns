namespace Chapter1.DesignPuzzle.Models;

public class Queen : Character
{
    public override void Fight()
    {
        if (WeaponBehaviour is not null)
        {
            Console.WriteLine($"Gracefully the queen fights, {WeaponBehaviour.UseWeapon()}");
        }
        else
        {
            throw new ArgumentNullException();
        }
    }
}