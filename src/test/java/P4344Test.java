import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P4344Test {
    @Test
    public void calculatePercentOfOverAverage(){
        assertEquals(40.000d, P4344.calculatePercentOfOverAverage(new int[]{50, 50, 70, 80, 100}), 0.001);
        assertEquals(57.143d, P4344.calculatePercentOfOverAverage(new int[]{100, 95, 90, 80, 70, 60, 50}), 0.001);
        assertEquals(33.333d, P4344.calculatePercentOfOverAverage(new int[]{70, 90, 80}), 0.001);
        assertEquals(66.667d, P4344.calculatePercentOfOverAverage(new int[]{70, 90, 81}), 0.001);
        assertEquals(55.556d, P4344.calculatePercentOfOverAverage(new int[]{100, 99, 98, 97, 96, 95, 94, 93, 91}), 0.001);
    }
}