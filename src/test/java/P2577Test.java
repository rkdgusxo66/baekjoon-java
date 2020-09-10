import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2577Test {
    @Test
    public void countNumber(){
        assertArrayEquals(new int[]{3, 1, 0, 2, 0, 0, 0, 2, 0, 0}, P2577.countNumber(new int[]{150, 266, 427}));
    }
}