import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1193Test {
    @Test
    void findFraction(){
        assertEquals("2/4", P1193.findFraction(14));
        assertEquals("1/1", P1193.findFraction(1));
        assertEquals("1/2", P1193.findFraction(2));
        assertEquals("3/1", P1193.findFraction(4));
    }
}