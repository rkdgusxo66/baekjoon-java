import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1003Test {
    @Test
    void countFiboTest() {
        P1003.n = 0;
        P1003.countFibo(0);
        assertEquals(1, P1003.memoZero[0]);
        assertEquals(0, P1003.memoOne[0]);

        P1003.n = 1;
        P1003.countFibo(0);
        assertEquals(0, P1003.memoZero[1]);
        assertEquals(1, P1003.memoOne[1]);

        P1003.n = 3;
        P1003.countFibo(0);
        assertEquals(1, P1003.memoZero[3]);
        assertEquals(2, P1003.memoOne[3]);

        P1003.n = 4;
        P1003.countFibo(0);
        assertEquals(2, P1003.memoZero[4]);
        assertEquals(3, P1003.memoOne[4]);

        P1003.n = 40;
        P1003.countFibo(0);
        assertEquals(63245986, P1003.memoZero[40]);
        assertEquals(102334155, P1003.memoOne[40]);
    }
}