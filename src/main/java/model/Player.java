package model;

import java.util.List;

public class Player {

    protected int distance;

    public Player(int distance) {
        this.distance = distance;
    }

    public static void verifyIfTheresOffsidePlayer(List<Striker> strikers, List<Defender> defenders) {
        int lastManDistance = Defender.getLastManDistance(defenders);
        System.err.println(Striker.hasOffSidePlayer(strikers, lastManDistance) ? "Y" : "N");
    }
}