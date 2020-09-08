import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10950Test {
    @Test
    public void onePlusOne(){
        assertEquals(2, P10950.onePlusOne(1, 1));
        assertEquals(5, P10950.onePlusOne(2, 3));
        assertEquals(7, P10950.onePlusOne(3, 4));
        assertEquals(17, P10950.onePlusOne(9, 8));
        assertEquals(7, P10950.onePlusOne(5, 2));
    }
}