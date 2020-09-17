import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2581Test {
    @Test
    void getPrimeNumberSumAndMin(){
        assertArrayEquals(new int[]{620, 61}, P2581.getPrimeNumberSumAndMin(60, 100));
        assertArrayEquals(new int[]{-1, -1}, P2581.getPrimeNumberSumAndMin(64, 65));
        assertArrayEquals(new int[]{-1, -1}, P2581.getPrimeNumberSumAndMin(1, 1));
    }
}