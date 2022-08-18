package JAVACOREDAY10.ex2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Song song = new Song("S01", "Heal the world", "Micheal Jackson");
        Song song2 = new Song("S02", "Rocketeer", "Far East Moment");

        Follower follower = new Follower("F01", "Hoang", "Hoang@gmail.com", 10);
        Follower follower2 = new Follower("F02", "Long", "Long@gmail.com", 15);

        Idol idol = new Idol("I01", "Son Tung", "tung@gmail.com", "Sky");
        Idol idol2 = new Idol("I02", "Do Mixi", "Do@gmail.com", "Do Mixi");

        ArrayList<Follower> followers = new ArrayList<>();
        followers.add(follower);
        followers.add(follower2);

        idol.setFollowers(followers);
        idol2.setFollowers(followers);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song2);

        ArrayList<Idol> idols = new ArrayList<>();
        idols.add(idol);
        idols.add(idol2);

        System.out.println(followers.toString());
        System.out.println(idols.toString());
    }
}
