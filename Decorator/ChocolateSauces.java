public class ChocolateSauces extends Decarator {
    Waffle waffle;
    public ChocolateSauces(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Chocolate Sauce";
    }

    @Override
    public double cost() {
        return 1.0+ waffle.cost();
    }
}
