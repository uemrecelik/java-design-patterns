public class MilkyChocolate extends Decarator{
    Waffle waffle;
    public MilkyChocolate(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Milky Chocolate";
    }

    @Override
    public double cost() {
        return 2.0+ waffle.cost();
    }
}
