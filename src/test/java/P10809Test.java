import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10809Test {
    @Test
    void getAlphaFirst(){
        assertArrayEquals(new int[]{1, 0, -1, -1, 2, -1, -1, -1, -1, 4, 3, -1, -1, 7, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                P10809.getAlphaFirst("baekjoon"));
    }
}