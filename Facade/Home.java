import java.util.List;

public class Home {

    Fan fan;
    TvStick TvStick;
    Light livingRoomLight;
    SoundBar soundBar;
    TV tv;
    CoffeeMaker CoffeMaker;
    ElectricGrill grill;
    Light kitchenLight;
    Microwave microwave;
    Refrigerator refrigerator;



    public Home() {

        super();

        fan = new livingRoomFan();
        tv = new livingRoomTV();
        TvStick = new TvStick(tv);
        livingRoomLight = new livingRoomLight();
        soundBar = new livingRoomSoundBar(tv);

        CoffeMaker = new CoffeeMaker();
        grill = new ElectricGrill();
        kitchenLight = new kitchenLight();
        microwave = new Microwave();
        refrigerator = new Refrigerator();

    }


    public void playMovieOnNetflix(String movieName) {

        fan.on();
        fan.increase();
        livingRoomLight.on();
        tv.on();
        ((livingRoomTV)tv).setSource("HDMI ARC");
        TvStick.on();
        soundBar.on();
        soundBar.setSoundMode("Dolby Atmos");
        TvStick.openApp("Netflix");
        TvStick.selectContent(movieName);
        ((livingRoomLight)livingRoomLight).dim();
        soundBar.volume(20);
        TvStick.play();

    }



    public void prepareFood(List<String> pizzaNames) {

        kitchenLight.on();
        refrigerator.partyMode();
        microwave.on();
        microwave.setOnPreHeat(200, 5);
        microwave.grillOn();
        grill.on();
        CoffeMaker.on();
        pizzaNames.forEach(pizzaName -> microwave.bake(pizzaName, 400, 10));

    }



    public void stopMovie() {

        TvStick.closeApp();
        TvStick.off();
        soundBar.off();
        tv.off();
        ((livingRoomLight)livingRoomLight).bright();
        fan.off();
    }

    public void closeKitchen() {

        refrigerator.normalMode();
        grill.off();
        CoffeMaker.off();
        microwave.off();

    }

}