public class RaspberrySauces extends Decarator {
    Waffle waffle;
    public RaspberrySauces(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Raspberry Sauce";
    }

    @Override
    public double cost() {
        return 1.0+ waffle.cost();
    }
}
