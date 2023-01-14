public class ElectricGrill extends Controller {


    protected int temp;

    public ElectricGrill() {
        super("electricGrill");
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.printf("Setting '%s' temp to '%d'.\n", name, temp);
    }

    public int temperature() {

        return temp;

    }

}