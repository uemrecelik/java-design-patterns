package cherrymx;

public class CherryMXBrand extends SwitchMaker {
    Switch cherryMX = null;
    SwitchComponentFactory switchComponentFactory = new cherryMXFactory();
    @Override
    cherryMXFactory createSwitch(String type) {
        return new cherryMXFactory();

    }

    @Override
    Switch assembleSwitch(String type) {
        if (type.equals("linear")) {
            int pressureCN = 45;
            cherryMX = new linearSwitch(switchComponentFactory);

        } else if (type.equals("clicky")){
            int pressureCN = 60;
                cherryMX = new clickySwitch(switchComponentFactory);
            }else if (type.equals("tacticle")){
            int pressureCN = 80;
            cherryMX = new tacticleSwitch(switchComponentFactory);
        }else

            return cherryMX;
        return null;
    }

}
