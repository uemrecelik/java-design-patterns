public class CaramelSauces extends Decarator{
    Waffle waffle;
    public CaramelSauces(Waffle waffle){
        this.waffle = waffle;

    }

    @Override
    public String getDesc() {
        return waffle.getDesc()+ ", Caramel Sauce";
    }

    @Override
    public double cost() {
        return 1.0+ waffle.cost();
    }
}
