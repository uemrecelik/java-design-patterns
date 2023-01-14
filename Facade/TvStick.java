public class TvStick extends Controller{


    protected TV tv;
    protected String applicaton;
    protected String showName;


    public TvStick(TV tv) {

        super("LivingRoomFireTV4KStick");

        this.tv = tv;

    }


    public void openApp(String appName) {

        this.applicaton = applicaton;

        System.out.printf("Opening '%s' on '%s'.\n", appName, name);

    }


    public void selectContent(String contentName) {

        this.showName = showName;

        System.out.printf("Searching '%s' on '%s'.\n", contentName, applicaton);

    }


    public void play() {

        System.out.printf("Playing '%s' on '%s'.\n", showName, applicaton);

    }


    public void closeApp() {

        System.out.printf("Closing '%s' on '%s'.\n", applicaton, name);

    }



    public TV tv() {

        return tv;

    }


    public String appName() {

        return applicaton;

    }



    public String contentName() {

        return showName;

    }

}