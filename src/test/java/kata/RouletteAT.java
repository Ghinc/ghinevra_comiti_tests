package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RouletteAT {

    int time = 2000;
    Ball ball = new Ball(time);
    Between0And37Randomizer rand = new JavaRandomizer();
    Roulette roulette = new Roulette(ball, rand);

    @Test
    public void itWaitsForTheBallToStop() {

        long start = System.currentTimeMillis();
        roulette.playGame();
        long arrival = System.currentTimeMillis();

        assertThat((arrival - start) > time);

    }

    @Test()
    public void itProvidesAResultWithColor() throws Exception {
        Result res =roulette.playGame();
        assertThat(res.color != null);
    }

}
