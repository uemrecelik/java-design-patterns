public class WhiteChocolate extends Decarator {


    Waffle waffle;
    public WhiteChocolate(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", White Chocolate";
    }

    @Override
    public double cost() {
        return 2.0+ waffle.cost();
    }
}
