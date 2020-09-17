import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1929Test {
    @Test
    void getPrimeNumbers(){
        assertArrayEquals(new Integer[]{3, 5, 7, 11, 13}, P1929.getPrimeNumbers(3, 16).toArray());
    }
}