import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P8958Test {
    @Test
    public void calculateScore(){
        assertEquals(10, P8958.calculateScore("OOXXOXXOOO"));
        assertEquals(9, P8958.calculateScore("OOXXOOXXOO"));
        assertEquals(7, P8958.calculateScore("OXOXOXOXOXOXOX"));
        assertEquals(55, P8958.calculateScore("OOOOOOOOOO"));
        assertEquals(30, P8958.calculateScore("OOOOXOOOOXOOOOX"));
    }
}