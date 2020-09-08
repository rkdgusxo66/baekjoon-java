import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P15552Test {
    @Test
    public void sum() {
        assertEquals(2, P15552.sum(1, 1));
        assertEquals(46, P15552.sum(12, 34));
        assertEquals(505, P15552.sum(5, 500));
        assertEquals(100, P15552.sum(40, 60));
        assertEquals(2000, P15552.sum(1000, 1000));
    }
}