public class Pistachio extends Decarator{
    Waffle waffle;
    public Pistachio(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Pistachio";
    }

    @Override
    public double cost() {
        return 1.0+ waffle.cost();
    }
}
