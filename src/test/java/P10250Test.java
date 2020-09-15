import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10250Test {
    @Test
    void getRoomNumber(){
        assertEquals(402, P10250.getRoomNumber(6, 12, 10));
        assertEquals(1203, P10250.getRoomNumber(30, 50, 72));
        assertEquals(601, P10250.getRoomNumber(6, 12, 6));
    }

}