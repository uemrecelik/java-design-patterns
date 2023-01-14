public class Banana extends Decarator{
    Waffle waffle;
    public Banana(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Banana";
    }

    @Override
    public double cost() {
        return 0.5+ waffle.cost();
    }
}
