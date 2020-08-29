import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2588Test {
    @Test
    public void getAnswer(){
        assertArrayEquals(new Integer[]{2360, 3776, 1416, 181720}, P2588.getAnswer(472, 385));
    }
}