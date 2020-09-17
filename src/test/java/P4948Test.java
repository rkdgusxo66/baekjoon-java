import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P4948Test {
    @Test
    void getPrimeNumberCount(){
        assertEquals(1, P4948.getPrimeNumberCount(1));
        assertEquals(4, P4948.getPrimeNumberCount(10));
        assertEquals(3, P4948.getPrimeNumberCount(13));
        assertEquals(21, P4948.getPrimeNumberCount(100));
        assertEquals(135, P4948.getPrimeNumberCount(1000));
        assertEquals(1033, P4948.getPrimeNumberCount(10000));
        assertEquals(8392, P4948.getPrimeNumberCount(100000));
    }
}