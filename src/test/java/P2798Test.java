import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P2798Test {
    @Test
    void getOptimizedAnswerBlackjack(){
        assertEquals(21,
                P2798.getOptimizedAnswerBlackjack(5, 21, Arrays.asList(5, 6, 7, 8, 9)));
        assertEquals(497,
                P2798.getOptimizedAnswerBlackjack(10, 500, Arrays.asList(93, 181, 245, 214, 315, 36, 185, 138, 216, 295)));
    }
}