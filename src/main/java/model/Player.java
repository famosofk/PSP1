package model;

import java.util.List;

public class Player {

    protected int distance;

    /**
     * Complexidade 1: Apenas um construtor sequencial.
     */
    public Player(int distance) {
        this.distance = distance;
    }

    /**
     * Complexidade 2: Apresenta um operador ternário de checagem única, equivalente a 1 if else.
     **/
    public static void verifyIfTheresOffsidePlayer(List<Striker> strikers, List<Defender> defenders) {
        int lastManDistance = Defender.getLastManDistance(defenders);
        System.err.println(Striker.hasOffSidePlayer(strikers, lastManDistance) ? "Y" : "N");
    }
}