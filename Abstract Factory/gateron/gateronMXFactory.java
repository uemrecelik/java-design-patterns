package gateron;

public class gateronMXFactory implements SwitchComponentFactory {
    @Override
    public KeyCap createKeyCap() {
        return new gateronMXkeyCap();
    }

    @Override
    public Stem createStem() {
        return new gateronMXstem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return new gateronMXcoilSpring();
    }
}
