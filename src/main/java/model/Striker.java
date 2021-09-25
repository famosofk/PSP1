package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Striker extends Player {
    public Striker(int distance) {
        super(distance);
    }


    /**
     * Complexidade desse método é 1, pois é sequencial.
     **/
    public boolean isOnOffSide(int lastManDistance) {
        return distance < lastManDistance;
    }

    /**
     * Complexidade desse método é 2, pois  anyMatch equivale a um for ao analisar o fluxo.
     **/
    public static boolean hasOffSidePlayer(List<Striker> strikers, int limit) {
        return strikers.stream().anyMatch(x -> x.isOnOffSide(limit));
    }

    /**
     * Na linha 40, temos um split que corresponde a for, pois é uma aplicação de regex. +1
     * Na linha 41, temos um for. +1. Complexidade total: 3.
     */
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