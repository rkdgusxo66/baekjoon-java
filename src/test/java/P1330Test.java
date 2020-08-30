import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1330Test {
    @Test
    public void compare(){
        assertEquals("<", P1330.compare(1, 2));
        assertEquals(">", P1330.compare(10, 2));
        assertEquals("==", P1330.compare(5, 5));
    }
}