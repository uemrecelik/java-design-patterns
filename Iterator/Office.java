public class Office extends Builder{
    @Override
    void buildCPU() {
        System.out.println("Putting low-end dual core cpu");
    }

    @Override
    void buildMeomory() {
        System.out.println("Putting energy efficent memory");
    }

    @Override
    void buildStorage() {
        System.out.println("Putting energ6y efficent hdd");
    }
}
