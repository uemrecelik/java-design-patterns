package cherrymx;

public class cherryMXFactory implements SwitchComponentFactory {
    @Override
    public KeyCap createKeyCap() {
        return new cherryMXkeyCap();
    }

    @Override
    public Stem createStem() {
        return new cherryMXstem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return new cherryMXcoilSpring();
    }
}
