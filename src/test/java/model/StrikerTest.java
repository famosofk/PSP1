package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class StrikerTest {
    @Test
    void isOffSideReturnsTrue() {
        Striker s1 = new Striker(0);
        assertThat(s1.isOnOffSide(150)).isTrue();
    }

    @Test
    void isOffSideReturnsFalse() {
        Striker s1 = new Striker(150);
        assertThat(s1.isOnOffSide(0)).isFalse();
    }

    @Test
    void hasOffSidePlayerReturnsTrue() {
        List<Striker> strikerList = new ArrayList<>();
        strikerList.add(new Striker(150));
        strikerList.add(new Striker(90));
        strikerList.add(new Striker(200));
        assertThat(Striker.hasOffSidePlayer(strikerList, 110)).isTrue();
    }
    @Test
    void hasOffSidePlayerReturnsFalse() {
        List<Striker> strikerList = new ArrayList<>();
        strikerList.add(new Striker(150));
        strikerList.add(new Striker(90));
        strikerList.add(new Striker(200));
        assertThat(Striker.hasOffSidePlayer(strikerList, 50)).isFalse();
    }
}