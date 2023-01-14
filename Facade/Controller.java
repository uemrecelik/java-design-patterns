public abstract class Controller implements Comparable<Controller> {

    protected String name;
    protected boolean stat;

    public Controller(String name) {
        super();
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void on() {
        if (stat) {
            System.out.printf("'%s' is already on\n", name);
        } else {
            stat = true;
            System.out.printf("Turning On '%s'\n", name);
        }
    }

    public void off() {

        if (!stat) {
            System.out.printf("'%s' is already off\n", name);
        } else {
            stat = false;
            System.out.printf("Turning Off '%s'\n", name);
        }
    }


    @Override

    public int compareTo(Controller other) {
        return this.name.compareToIgnoreCase(other.name);
    }



}

