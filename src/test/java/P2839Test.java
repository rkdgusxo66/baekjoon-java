import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2839Test {
    @Test
    void getMinBag(){
        assertEquals(4, P2839.getMinBag(18));
        assertEquals(-1, P2839.getMinBag(4));
        assertEquals(2, P2839.getMinBag(6));
        assertEquals(3, P2839.getMinBag(9));
        assertEquals(3, P2839.getMinBag(11));
    }
}