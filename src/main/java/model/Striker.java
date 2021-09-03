package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Striker extends Player {
    public Striker(int distance) {
        super(distance);
    }

    public boolean isOnOffSide(int lastManDistance) {
        return distance < lastManDistance;
    }

    public static boolean hasOffSidePlayer(List<Striker> strikers, int limit) {
        return strikers.stream().anyMatch(x -> x.isOnOffSide(limit));
    }

    public static List<Striker> create(String line) {
        List<Striker> list = new ArrayList<>();
        String[] players = line.split(" ");
        Arrays.stream(players).forEach(x -> list.add(
                        new Striker(Integer.parseInt(x))
                )
        );
        return list;
    }
}