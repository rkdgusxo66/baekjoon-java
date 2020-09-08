import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10871Test {
    @Test
    public void getAnswer() {
        assertArrayEquals(new Integer[]{1, 4, 2, 3}, P10871.getAnswer(5, new Integer[]{1, 10, 4, 9, 2, 3, 8, 5, 7, 6}));
    }
}