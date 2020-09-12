import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1316Test {
    @Test
    void isGroupWord(){
        assertEquals(true, P1316.isGroupWord("happy"));
        assertEquals(true, P1316.isGroupWord("new"));
        assertEquals(true, P1316.isGroupWord("year"));
        assertEquals(false, P1316.isGroupWord("aba"));
        assertEquals(false, P1316.isGroupWord("abab"));
        assertEquals(false, P1316.isGroupWord("abcabc"));
        assertEquals(true, P1316.isGroupWord("a"));
    }

}