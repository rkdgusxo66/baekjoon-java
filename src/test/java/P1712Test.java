import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1712Test {
    @Test
    void getBreakEvenPoint(){
        assertEquals(11, P1712.getBreakEvenPoint(1000, 70, 170));
        assertEquals(-1, P1712.getBreakEvenPoint(1000, 70, 70));
        assertEquals(-1, P1712.getBreakEvenPoint(1, 70, 70));
        assertEquals(-1, P1712.getBreakEvenPoint(1, 70, 60));
    }
}