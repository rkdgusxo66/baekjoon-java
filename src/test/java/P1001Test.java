import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1001Test {
    @Test
    public void sub(){
        assertEquals(1, P1001.sub(3, 2));
        assertEquals(8, P1001.sub(9, 1));
    }
}