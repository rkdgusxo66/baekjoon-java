import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P9663Test {
    @Test
    void isPromisingTest(){
        P9663.nthLineQueen = new int[2];
        P9663.nthLineQueen[0] =0;
        P9663.result =0;
        assertFalse(P9663.isPromising(0, 1));
        assertFalse(P9663.isPromising(1, 0));
        assertFalse(P9663.isPromising(1, 1));
    }

    @Test
    void backtrackTest(){
        P9663.result =0;
        P9663.nthLineQueen = new int[1];
        assertEquals(1, P9663.backtrack(0, 1));

        P9663.result =0;
        P9663.nthLineQueen = new int[2];
        assertEquals(0, P9663.backtrack(0, 2));

        P9663.result =0;
        P9663.nthLineQueen = new int[3];
        assertEquals(0, P9663.backtrack(0, 3));

        P9663.result =0;
        P9663.nthLineQueen = new int[8];
        assertEquals(92, P9663.backtrack(0, 8));
    }
}