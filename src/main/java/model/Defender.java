package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Defender extends Player {
    public Defender(int distance) {
        super(distance);
    }

    public static int getLastManDistance(List<Defender> defenderList) {
        //TODO(Rever essa regra)
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

    public static List<Defender> create(String line) {
        //TODO("Eu removi o teste desse método, porque pretendo generalizar ele, porém ainda não sei como.")
        List<Defender> list = new ArrayList<>();
        String[] players = line.split(" ");
        Arrays.stream(players).forEach(x -> list.add(
                        new Defender(Integer.parseInt(x))
                )
        );
        return list;
    }
}