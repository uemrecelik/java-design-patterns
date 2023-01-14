public class livingRoomSoundBar extends SoundBar {

    protected TV tv;

    public livingRoomSoundBar(TV tv) {
        super("Living RoomSound Bar");
        this.tv = tv;

    }

    public TV tv() {
        return tv;
    }

}