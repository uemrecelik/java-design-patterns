public class Nutella extends Decarator{
    Waffle waffle;
    public Nutella(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Nutella";
    }

    @Override
    public double cost() {
        return 2.0+ waffle.cost();
    }
}
