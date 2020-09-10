import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1546Test {
    @Test
    public void getNewAverage(){
        assertEquals(75.0, P1546.getNewAverage(new int[]{40, 80, 60}), 0.01);
        assertEquals(66.666667, P1546.getNewAverage(new int[]{10, 20, 30}), 0.01);
    }
}