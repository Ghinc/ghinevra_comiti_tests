package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


/**
 * IT integration-test testing the real thing in integration
 * the suffix IT means that it's run in a separate test suite.
 * Another possibility is to put this into a separate directory like src/integration-test/java
 */
public class BallIT {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        int time= 2000;
        Ball balle = new Ball(time);
        long start = System.currentTimeMillis();
        balle.roll();
        long arrival =  System.currentTimeMillis();
        assertThat((arrival - start)-time < 15);

    }
}
