import java.util.ArrayList;

public class Celebrity {

    private String celebrityName;
    private ArrayList<Observer> followers;


    public Celebrity(String celebrityName) {
        this.celebrityName = celebrityName;
        followers = new ArrayList<Observer>();
    }

    public void register(Observer o) {
        followers.add(o);
        System.out.println(o + " has started following " + celebrityName);
    }


    public void removeObserver(Observer o) {
        followers.remove(o);
        System.out.println(o + " has stopped following " + celebrityName);
    }



    public void notifyObservers(String tweet) {
        for(Observer follower : followers)
        {
            follower.update(celebrityName, tweet);
        }
        System.out.println();
    }


    public void tweet(String tweet)
    {

        System.out.println("\n" + celebrityName + " has tweeted :: " + tweet + "\n");

        notifyObservers(tweet);
    }

}


