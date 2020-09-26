import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P14888Test {
    @Test
    void backtrackTest(){
        P14888.numbers.clear(); P14888.numbers.addAll(Arrays.asList(5, 6));
        P14888.plus=0;P14888.minus=0;P14888.mul=1;P14888.div=0;
        P14888.result = P14888.numbers.get(0);
        P14888.backtrack(0);
        assertEquals(30, P14888.min);
        assertEquals(30, P14888.max);

        P14888.numbers.clear(); P14888.numbers.addAll(Arrays.asList(3, 4, 5));
        P14888.plus=1;P14888.minus=0;P14888.mul=1;P14888.div=0;
        P14888.result = P14888.numbers.get(0);
        P14888.backtrack(0);
        assertEquals(17, P14888.min);
        assertEquals(35, P14888.max);

        P14888.numbers.clear(); P14888.numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        P14888.plus=2;P14888.minus=1;P14888.mul=1;P14888.div=1;
        P14888.result = P14888.numbers.get(0);
        P14888.backtrack(0);
        assertEquals(-24, P14888.min);
        assertEquals(54, P14888.max);
    }
}