import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2675Test {
    @Test
    void repeatAlphaNumeric(){
        assertEquals("AAABBBCCC", P2675.repeatAlphaNumeric(3, "ABC"));
        assertEquals("/////HHHHHTTTTTPPPPP", P2675.repeatAlphaNumeric(5, "/HTP"));
    }
}