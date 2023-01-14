public class Walnut extends Decarator{
    Waffle waffle;
    public Walnut(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Walnut";
    }

    @Override
    public double cost() {
        return 1.0+ waffle.cost();
    }
}
