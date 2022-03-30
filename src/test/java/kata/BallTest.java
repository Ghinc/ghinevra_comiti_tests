package kata;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        int time= 2000;
        Ball balle = new Ball(time);
        long start = System.currentTimeMillis();
        balle.roll();
        long arrival =  System.currentTimeMillis();
        assertThat((arrival - start)-time < 15); // 15 est une marge arbitraire
    }
}
