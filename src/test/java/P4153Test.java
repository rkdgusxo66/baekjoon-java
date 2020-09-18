import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P4153Test {
    @Test
    void isPita(){
        assertEquals(true, P4153.isPita(6, 8, 10));
        assertEquals(false, P4153.isPita(25, 52, 60));
        assertEquals(true, P4153.isPita(5, 12, 13));
        assertEquals(false, P4153.isPita(29999, 29999, 29999));
    }
}