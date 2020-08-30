import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2739Test {
    @Test
    public void nineToNine(){
        assertEquals("2 * 1 = 2\n" +
                "2 * 2 = 4\n" +
                "2 * 3 = 6\n" +
                "2 * 4 = 8\n" +
                "2 * 5 = 10\n" +
                "2 * 6 = 12\n" +
                "2 * 7 = 14\n" +
                "2 * 8 = 16\n" +
                "2 * 9 = 18", P2739.nineToNine(2));
    }
}