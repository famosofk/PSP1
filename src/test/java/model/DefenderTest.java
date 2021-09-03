package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class DefenderTest {

    @Test
    void testGetLastManDistanceTest() {
        List<Defender> list = new ArrayList<>();
        list.add(new Defender(150));
        list.add(new Defender(350));
        list.add(new Defender(250));
        assertThat(Defender.getLastManDistance(list)).isEqualTo(250);
    }
}