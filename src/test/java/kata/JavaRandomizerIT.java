package kata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaRandomizerIT {


    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        JavaRandomizer rand  = new JavaRandomizer();
        for(int i=0;i<1000;i++){
            int roul = rand.getRouletteResult();
            assertThat(roul >= 0 && roul <= 37);

        }
    }

    @Test
    public void allNumbersOccur() throws Exception {
        ArrayList<Integer> toOccur = new ArrayList<Integer>();
        for(int i =0; i<37;i++){
            toOccur.add(i);
        }
        ArrayList<Integer> occured = new ArrayList<Integer>();
        for(int i=0; i<1000;i++){
            if( !occured.contains(i)){
                occured.add(i);
            }
        }

        assertEquals(occured.size(),toOccur.size());

    }


}
