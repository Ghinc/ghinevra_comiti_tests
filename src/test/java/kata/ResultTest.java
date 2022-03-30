package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        Result result = new Result(37);
        assertThat(result.number=="00");
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        assertThrows(RouletteException.class, () -> new Result(38));
        assertThrows(RouletteException.class, () -> new Result(-1));



    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        Result res0 = new Result(0);
        Result res00 = new Result(37);
        assertThat(res0.color== Result.Color.GREEN);
        assertThat(res00.color== Result.Color.GREEN);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        for(int i =1; i<37; i++){
            if(i%2==0){
                Result evenRes = new Result(i);
                assertEquals(evenRes.color, Result.Color.BLACK);
            }
        }
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        for(int i =1; i<37; i++){
            if(i%2!=0){
                Result evenRes = new Result(i);
                assertEquals(evenRes.color, Result.Color.RED);
            }
        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {

        assertThrows(RouletteException.class, () -> new Result(38));

    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {
        assertThrows(RouletteException.class, () -> new Result(-1));

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {


    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}