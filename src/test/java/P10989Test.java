import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P10989Test {
    @Test
    void sort(){
        int input[] = new int[]{5, 2, 3, 1, 4, 2, 3, 5, 1, 7};
        int output[] = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5, 7};
        assertArrayEquals(output, P10989.sort(input));

        int input2[] = new int[]{5,111,1,1,2,4,393,4, 2, 3, 1, 4, 2, 3, 5, 1, 7};
        int input3[] = new int[]{5,111,1,1,2,4,393,4, 2, 3, 1, 4, 2, 3, 5, 1, 7};
        Arrays.sort(input2);
        assertArrayEquals(input2, P10989.sort(input3));

        int input4[] = new int[]{1,1,1,1,1};
        int input5[] = new int[]{1,1,1,1,1};
        Arrays.sort(input4);
        assertArrayEquals(input4, P10989.sort(input5));
    }
}