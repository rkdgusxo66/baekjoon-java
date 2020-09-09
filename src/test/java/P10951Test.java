import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10951Test {
    @Test
    public void sum() {
        assertEquals(2, P10951.sum(1, 1));
        assertEquals(5, P10951.sum(2, 3));
        assertEquals(7, P10951.sum(3, 4));
        assertEquals(17, P10951.sum(9, 8));
        assertEquals(7, P10951.sum(5, 2));
    }

}