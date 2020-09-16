import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P1978Test {
    @Test
    void getPrimeNumberCount(){
        assertEquals(3, P1978.getPrimeNumberCount(Arrays.asList(1, 3, 5, 7)));
        assertEquals(4, P1978.getPrimeNumberCount(Arrays.asList(2, 3, 4, 5, 6, 7)));
    }
}