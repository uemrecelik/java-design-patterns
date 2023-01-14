public abstract class Builder {

    final void builder(){
       buildCPU();
       buildMeomory();
       buildStorage();
       buildPeripherals();

    }

    abstract void buildCPU();
    abstract void buildMeomory();
    abstract void buildStorage();
    void buildPeripherals(){
        System.out.println("connecting mouse keyboard and monitor");
    }
}
