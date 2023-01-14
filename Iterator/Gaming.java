public class Gaming extends Builder{

    @Override
    void buildCPU() {
        System.out.println("Putting high-end multi core cpu");
    }

    @Override
    void buildMeomory() {
        System.out.println("Putting high clock speed memory");
    }

    @Override
    void buildStorage() {
        System.out.println("Putting ssd storage");
    }
}
