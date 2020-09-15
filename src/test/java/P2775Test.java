import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2775Test {
    @Test
    void getResident(){
        assertEquals(6, P2775.getResident(1, 3));
        assertEquals(10, P2775.getResident(2, 3));
    }
}