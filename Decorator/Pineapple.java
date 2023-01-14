public class Pineapple extends Decarator{
    Waffle waffle;
    public Pineapple(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Pineapple";
    }

    @Override
    public double cost() {
        return 0.5+ waffle.cost();
    }
}
