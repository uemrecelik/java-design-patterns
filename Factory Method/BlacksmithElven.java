public class BlacksmithElven implements Blacksmith{
    public Weapon createWeapon(TypeOfWeapon type) {
        return new WeaponElven(type);
    }
}
