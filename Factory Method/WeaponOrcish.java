public class WeaponOrcish implements Weapon {
    private TypeOfWeapon typeOfWeapon;

    public WeaponOrcish(TypeOfWeapon type)
    {
        typeOfWeapon = type;
    }

    public String toString()
    {
        return "Orcish " + typeOfWeapon;
    }

    @Override
    public TypeOfWeapon getTypeOfWeapon() {
        return null;
    }
}


