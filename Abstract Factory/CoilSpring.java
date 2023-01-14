public abstract class CoilSpring {

    int pressureCN;

    public CoilSpring(int pressureCN) {
        this.pressureCN = pressureCN;
    }

    public CoilSpring() {
    }

    @Override
    public String toString() {
        return "CoilSpring{" +
                "pressureCN=" + pressureCN +
                '}';
    }
}
