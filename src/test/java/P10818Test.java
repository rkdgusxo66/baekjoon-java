import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10818Test {
    @Test
    public void getMinMax(){
        assertArrayEquals(new int[]{7, 35}, P10818.getMinMax(new int[]{20, 10, 35, 30, 7}));
    }
}