import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1002Test {
    @Test
    void getPossiblePositionNum(){
        assertEquals(2, P1002.getPossiblePositionNum(0, 0, 13, 40, 0, 37));
        assertEquals(1, P1002.getPossiblePositionNum(0, 0, 3, 0, 7, 4));
        assertEquals(0, P1002.getPossiblePositionNum(1, 1, 1, 1, 1, 5));
        assertEquals(0, P1002.getPossiblePositionNum(0, 0, 5, 0, 1, 1));
        assertEquals(1, P1002.getPossiblePositionNum(0, 0, 5, 0, 1, 4));
    }
}