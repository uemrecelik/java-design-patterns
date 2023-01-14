public class Almond extends Decarator{
    Waffle waffle;
    public Almond(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Almond";
    }

    @Override
    public double cost() {
        return 1.0+ waffle.cost();
    }
}
