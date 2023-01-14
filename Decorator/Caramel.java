public class Caramel extends Decarator{
    Waffle waffle;
    public Caramel(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Caramel";
    }

    @Override
    public double cost() {
        return 2.0+ waffle.cost();
    }
}
