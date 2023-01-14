public class Strawberry extends Decarator {

    Waffle waffle;
    public Strawberry(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Strawberry";
    }

    @Override
    public double cost() {
        return 0.5+ waffle.cost();
    }
}




