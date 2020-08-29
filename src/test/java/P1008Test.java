import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1008Test {
    static final double DELTA = 1e-9;
    @Test
    public void div() {
        assertEquals(0.33333333333333333333333333333333, P1008.div(1, 3), DELTA);
        assertEquals(0.8, P1008.div(4, 5), DELTA);
    }

}