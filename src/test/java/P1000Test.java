import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1000Test {
    @Test
    public void sum(){
        assertEquals(P1000.sum(1, 2), 3);
        assertEquals(P1000.sum(3, 4), 7);
    }

}