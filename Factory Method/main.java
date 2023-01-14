public class main {
    public static void main(String[] args) {
        Blacksmith blacksmith;
        Weapon weapon;

        blacksmith = new BlacksmithOrcish();
        weapon = blacksmith.createWeapon(TypeOfWeapon.spear);
        System.out.println(weapon);
        weapon = blacksmith.createWeapon(TypeOfWeapon.axe);
        System.out.println(weapon);

        blacksmith = new BlacksmithElven();
        weapon = blacksmith.createWeapon(TypeOfWeapon.sSword);
        System.out.println(weapon);
        weapon = blacksmith.createWeapon(TypeOfWeapon.spear);
        System.out.println(weapon);
    }
}
