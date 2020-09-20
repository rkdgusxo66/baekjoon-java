import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1427Test {
    @Test
    void sortString(){
        assertEquals("4321", P1427.sortString("2143"));
        assertEquals("43221111", P1427.sortString("21243111"));
        assertEquals("1000000000", P1427.sortString("1000000000"));
        assertEquals("1100", P1427.sortString("1001"));
    }
}