public class Main {

    public static void main(String[] args) {
        Celebrity karsu = new Celebrity("Karsu Dönmez");
        Celebrity ferit = new Celebrity("Ferit Odman");

        Follower deniz = new Follower("Deniz");
        Follower robert = new Follower("Robert");
        Follower steven = new Follower("Steven");
        Follower jeff =  new Follower("Jeff");
        Follower sandra = new Follower("Sandra");
        Follower olivia =  new Follower("Olivia");

        karsu.register(deniz);
        karsu.register(robert);
        karsu.register(steven);

        ferit.register(jeff);
        ferit.register(sandra);
        ferit.register(olivia);


        karsu.tweet("which artists will be guests in my room ..............");
        ferit.tweet("It rarely happens to me .......");


        karsu.removeObserver(jeff);

        karsu.tweet("WHAA I am new ...............");

    }

}

