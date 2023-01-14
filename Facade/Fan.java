

public abstract class Fan extends Controller {


    public static int MAX = 4;
         static int MIN = 1;

    protected int fanSpeed = 1;

    public Fan(String name) {
        super(name);
    }

    public void increase() {

        if (fanSpeed < MAX) {
            fanSpeed++;
            System.out.printf("Encreasing Speed of '%s' to '%d'.\n", name, fanSpeed);
        } else {
            System.out.printf("'%s' is already  at max!\n", name);
        }
    }


    public void decrease() {
        if (fanSpeed > MIN) {
            fanSpeed--;
            System.out.printf("Decreasing Speed of '%s' to '%d'.\n", name, fanSpeed);
        } else {
            System.out.printf("'%s' is laready running at minimum !\n", name);
        }
    }

}

