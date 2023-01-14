package gateron;

import cherrymx.cherryMXFactory;

public class gateronMXBrand extends SwitchMaker {
    Switch gateronMX = null;
    SwitchComponentFactory switchComponentFactory = new gateronMXFactory();
    @Override
    cherryMXFactory createSwitch(String type) {
        return new cherryMXFactory();

    }

    @Override
    Switch assembleSwitch(String type) {
        if (type.equals("linear")) {
            int pressureCN = 45;
            gateronMX = new linearSwitch(switchComponentFactory);

        } else if (type.equals("clicky")){
            int pressureCN = 60;
            gateronMX = new clickySwitch(switchComponentFactory);
        }else if (type.equals("tacticle")){
            int pressureCN = 80;
            gateronMX = new tacticleSwitch(switchComponentFactory);
        }else

            return gateronMX;
        return null;
    }

}
