package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Defender extends Player {
    /**
     * Complexidade 1: Apenas um construtor sequencial.
     */
    public Defender(int distance) {
        super(distance);
    }

    /**
     * Complexidade 3: Na linha 24, temos uma chamada de map. Corresponde a utilização de um for para criação de uma lista
     * com o atributo distance. +1 ponto de complexidade
     * Na linha 25, temos uma chamada de ordenação dessa lista, porém não contaremos, pois ela não altera o fluxo.
     * Na linha 27, temos um if +1
     */
    public static int getLastManDistance(List<Defender> defenderList) {
        List<Integer> distanceList = defenderList.stream()
                .map(v -> v.distance)
                .sorted(Integer::compare)
                .collect(Collectors.toList());
        if (distanceList.size() <= 1) {
            return 0;
        } else {
            return distanceList.get(1);
        }
    }

    /**
     * Na linha 40, temos um for. +1. Complexidade total: 2.
     */
    public static List<Defender> create(String line) {
        List<Defender> list = new ArrayList<>();
        String[] players = line.split(" ");
        Arrays.stream(players).forEach(x -> list.add(  //+1
                        new Defender(Integer.parseInt(x))
                )
        );
        return list;
    }
}