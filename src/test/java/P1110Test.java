import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1110Test {
    @Test
    public void getCycleLength(){
        assertEquals(4, P1110.getCycleLength(26));
        assertEquals(3, P1110.getCycleLength(55));
        assertEquals(60, P1110.getCycleLength(1));
    }
}