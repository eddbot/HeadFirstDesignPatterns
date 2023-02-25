namespace Chapter1.DesignPuzzle.Models;

public abstract class Character
{
    protected IWeaponBehaviour? WeaponBehaviour { get; set; }

    public virtual void Fight()
    {
        throw new NotImplementedException($"Implement Fight() in the {this}");
    }

    public void SetWeapon(IWeaponBehaviour weaponBehaviour)
    {
        WeaponBehaviour = weaponBehaviour;
    }
}