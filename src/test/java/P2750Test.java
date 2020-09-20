import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2750Test {
    @Test
    void sort(){
       assertArrayEquals(new int[]{1, 2, 3, 4, 5} , P2750.sort(new int[]{5, 2, 3, 4, 1}));
    }
}