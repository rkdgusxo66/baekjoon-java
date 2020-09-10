import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3052Test {
    @Test
    public void countDigit(){
        assertEquals(6, P3052.countDigit(new int[]{39, 40, 41, 42, 43, 44, 82, 83, 84, 85}));
    }

}