import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class MainTest {

    @Test
    void exampleTest() {
        assertThat(true).isTrue();
    }

    @Test
    void testReadPlayersInvolved() {
        String readLine = "2 3";

        String[] playersInvolved = readLine.split(" ");
        Integer strikers = Integer.parseInt(playersInvolved[0]);
        Integer defenders = Integer.parseInt(playersInvolved[1]);

        assertThat(strikers).isEqualTo(2);
        assertThat(defenders).isEqualTo(3);
    }
}