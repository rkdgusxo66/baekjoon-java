import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10039Test {
    @Test
    public void getAverage() {
        assertEquals(68, P10039.getAverage(new int[]{10, 65, 100, 30, 95}));
    }
}