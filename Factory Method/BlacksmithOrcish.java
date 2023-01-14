public class BlacksmithOrcish implements Blacksmith{
    public Weapon createWeapon(TypeOfWeapon type) {
        return new WeaponOrcish(type);
    }

}
