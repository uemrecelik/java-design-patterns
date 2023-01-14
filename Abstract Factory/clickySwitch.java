public class clickySwitch extends Switch{

    SwitchComponentFactory switchComponentFactory;

    public clickySwitch(SwitchComponentFactory switchComponentFactory){
        this.switchComponentFactory = switchComponentFactory;
    }

    @Override
    void gatherParts() {
    }

    @Override
    void placeCoilSpring() {
        super.placeCoilSpring();
    }

    @Override
    void placeStem() {
        super.placeStem();
    }

    @Override
    void placeKeyCap() {
        super.placeKeyCap();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
