public class Hazelnut extends Decarator{
    Waffle waffle;
    public Hazelnut(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Hazelnut";
    }

    @Override
    public double cost() {
        return 1.0+ waffle.cost();
    }
}
