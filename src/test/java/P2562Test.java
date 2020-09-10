import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2562Test {
    @Test
    public void getMaxAndOrder(){
        assertArrayEquals(new int[]{85, 8}, P2562.getMaxAndOrder(new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61}));
    }
}