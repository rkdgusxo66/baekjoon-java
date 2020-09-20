import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2751Test {
    @Test
    void qsort(){
        int [] input1 = new int[]{5, 4, 3, 2, 1};
        P2751.qsort(input1, 0, input1.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, input1);

        int [] input2 = new int[]{2, 4, 1, 6, 7, 10, 1000, 3};
        P2751.qsort(input2, 0, input2.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 7, 10, 1000}, input2);
    }
}