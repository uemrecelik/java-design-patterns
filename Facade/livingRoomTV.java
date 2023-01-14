public class livingRoomTV extends TV {

    protected String source;

    public livingRoomTV() {
        super("Living Room TV");
    }


    public void setSource(String source) {
        this.source = source;
        System.out.printf("Setting Source of '%s' to '%s'.\n", name, source);

    }


    public String source() {
        return source;

    }
}
