public class livingRoomLight extends Light {
    protected int lightValue = 50;
    public livingRoomLight() {
        super("LivingRoomLight");

    }

    public void dim() {
        lightValue = 20;
        System.out.printf("Dimming '%s'.\n", name);

    }


    public void bright() {
        lightValue = 100;
        System.out.printf("Setting brightness of '%s' to '%d'.\n", name, lightValue);

    }
}