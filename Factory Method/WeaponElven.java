public class WeaponElven implements Weapon{
    private TypeOfWeapon typeOfWeapon;

    public WeaponElven(TypeOfWeapon typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String toString() {
        return "Elven " + typeOfWeapon;
    }


    @Override
    public TypeOfWeapon getTypeOfWeapon() {
        return typeOfWeapon;
    }
}
