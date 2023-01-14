public class DarkChocolate extends Decarator{
    Waffle waffle;
    public DarkChocolate(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Dark Chocolate";
    }

    @Override
    public double cost() {
        return 2.0+ waffle.cost();
    }
}
