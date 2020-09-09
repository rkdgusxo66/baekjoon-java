import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10817Test {
    @Test
    public void getSecondBigger(){
        assertEquals(20, P10817.getSecondBigger(new int[]{20, 30, 10}));
        assertEquals(30, P10817.getSecondBigger(new int[]{30, 30, 10}));
        assertEquals(40, P10817.getSecondBigger(new int[]{40, 40, 40}));
    }
}