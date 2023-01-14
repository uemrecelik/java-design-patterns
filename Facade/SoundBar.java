public abstract class SoundBar extends Controller {

    public static int MAX = 30;
    public static int MIN = 0;


    protected String soundMode;

    protected int volume = 1;

    protected int volumeWhenMute;


    public SoundBar(String name) {
        super(name);
    }




    public void setSoundMode(String soundMode) {
        this.soundMode = soundMode;
        System.out.printf("Setting Sound-Mode of '%s' to '%s'.\n", name, soundMode);
    }


    public void increaseVolume() {
        if (volume < MAX) {
            volume++;
            System.out.printf("Encreasing volume of '%s' to '%d'.\n", name, volume);
        } else {
            System.out.printf("'%s' is already on top volume!\n", name);

        }

    }


    public void decreaseVolume() {
        if (volume > MIN) {
            volume--;
            System.out.printf("Decreasing volume of '%s' to '%d'.\n", name, volume);

        } else {
            System.out.printf("'%s' is already on mute!\n", name);

        }

    }


    public void volume(int volume) {

        if (volume >= MIN && volume <= MAX) {
            volume = volume;
            System.out.printf("Setting volume of '%s' to '%d'.\n", name, volume);
        } else {
            System.out.printf("Volume of '%s' is supports range between '%d' and '%d'!\n", name, MIN, MAX);
        }

    }


    public void mute() {

        if (volume != MIN) {
            volumeWhenMute = volume;
            volume = 0;
            System.out.printf("Putting '%s' on mute!\n", name);

        } else {
            volume = volumeWhenMute;
            System.out.printf("Unmuting '%s'. Setting volume back to '%d'!\n", name, volume);
        }
    }

    public String soundMode() {
        return soundMode;

    }

}