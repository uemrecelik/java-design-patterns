public class Kiwi extends Decarator {
    Waffle waffle;
    public Kiwi(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Kiwi";
    }

    @Override
    public double cost() {
        return 0.5+ waffle.cost();
    }
}
