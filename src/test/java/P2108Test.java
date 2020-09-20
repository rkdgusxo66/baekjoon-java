import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2108Test {
    @Test
    void getStatistics(){
        assertArrayEquals(new int[]{2, 2, 1, 10}, P2108.getStatistics(new int[]{1, 3, 8, -2, 2}));
        assertArrayEquals(new int[]{4000, 4000, 4000, 0}, P2108.getStatistics(new int[]{4000}));
        assertArrayEquals(new int[]{-2, -2, -1, 2}, P2108.getStatistics(new int[]{-1, -2, -3, -1, -2}));
    }
}