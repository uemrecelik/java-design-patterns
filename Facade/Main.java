import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Home home = new Home();

        System.out.println("Setting up movie...");

        home.playMovieOnNetflix("SpiderMan");

        System.out.println("Preparing food");

        home.prepareFood(Arrays.asList("Napolitanj Pizza", "Margarita Pizza", "Marinara Pizza"));

        System.out.println("Movie Completed.");
        System.out.println("Stopping Movie...");
        home.stopMovie();
        System.out.println("Closing Kitchen...");
        home.closeKitchen();


    }

}