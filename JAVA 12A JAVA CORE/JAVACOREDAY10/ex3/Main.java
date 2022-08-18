package JAVACOREDAY10.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Champion>team1 = new ArrayList<>();
        List<Champion>team2 = new ArrayList<>();

        Champion champion1 = new Champion("Yasuo", "Middle");
        Champion champion2 = new Champion("Jinx", "Bottom");
        Champion champion3 = new Champion("Darius", "Top");
        Champion champion4 = new Champion("Hecarim", "Jungle");
        Champion champion5 = new Champion("Nautilus", "Support");

        team1.add(champion1);
        team1.add(champion2);
        team1.add(champion3);
        team1.add(champion4);
        team1.add(champion5);

        Champion champion6 = new Champion("Katarina", "Middle");
        Champion champion7 = new Champion("Samira", "Bottom");
        Champion champion8 = new Champion("Irelia", "Top");
        Champion champion9 = new Champion("Master Yi", "Jungle");
        Champion champion10 = new Champion("Morgana", "Support");

        team2.add(champion6);
        team2.add(champion7);
        team2.add(champion8);
        team2.add(champion9);
        team2.add(champion10);

        System.out.println("Team 1:" + "\n" + team1.toString());
        System.out.println("Team 2:" + "\n" + team2.toString());
    }
}
