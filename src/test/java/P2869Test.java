import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2869Test {
    @Test
    void calculateTakingDays(){
        assertEquals(4, P2869.calculateTakingDays(2, 1, 5));
        assertEquals(2, P2869.calculateTakingDays(2, 1, 3));
        assertEquals(1, P2869.calculateTakingDays(3, 2, 3));
        assertEquals(1, P2869.calculateTakingDays(7, 1, 7));
    }
}