import cherrymx.cherryMXFactory;

public abstract class SwitchMaker {
    abstract cherryMXFactory createSwitch(String type);
    abstract Switch assembleSwitch(String type);
}
