import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1011Test {
    @Test
    void getMinJump(){
        assertEquals(3, P1011.getMinJump(0, 3));
        assertEquals(3, P1011.getMinJump(1, 5));
        assertEquals(4, P1011.getMinJump(45, 50));
        assertEquals(4, P1011.getMinJump(0, 6));
        assertEquals(4, P1011.getMinJump(0, 5));
        assertEquals(3, P1011.getMinJump(0, 4));
        assertEquals(1, P1011.getMinJump(0, 1));
        assertEquals(2, P1011.getMinJump(0, 2));
        assertEquals(6, P1011.getMinJump(0, 12));
    }
}