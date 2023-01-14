public abstract class TV extends Controller {

    public static int MAX = 30;
    public static int MIN = 0;

    public static int NUMBEROFCHANELS = 999;


    public static int MINChane = 1;

    protected int volume = 1;
    protected int chanel = 1;
    protected int mutedVolume;


    public TV(String name) {
        super(name);
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


    public void mute() {

        if (volume != MIN) {
            mutedVolume = volume;
            volume = 0;
            System.out.printf("Putting '%s' on mute!\n", name);
        } else {
            volume = mutedVolume;
            System.out.printf("Unmuting '%s'. Setting volume back to '%d'!\n", name, volume);

        }

    }


    public void increaseChannel() {

        if (chanel < NUMBEROFCHANELS) {
            chanel++;
            System.out.printf("Encreasing channel of '%s' to '%d'.\n", name, chanel);
        } else {
            System.out.printf("'%s' is already showing channel '%d'!\n", name, chanel);
        }

    }


    public void decreaseChannel() {

        if (chanel > MINChane) {
            chanel--;
            System.out.printf("Decreasing channel of '%s' to '%d'.\n", name, chanel);
        } else {
            System.out.printf("'%s' is already showing channel '%d'!\n", name, chanel);

        }

    }

}