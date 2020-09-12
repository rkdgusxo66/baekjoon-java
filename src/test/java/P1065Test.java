import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1065Test {
    @Test
    void countHanNumber(){
        assertEquals(99, P1065.countHanNumber(110));
        assertEquals(1, P1065.countHanNumber(1));
        assertEquals(105, P1065.countHanNumber(210));
        assertEquals(144, P1065.countHanNumber(1000));
    }
}