import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10000Test {
    @Test
    public void sum(){
        assertEquals(P10000.sum(1, 2), 3);
        assertEquals(P10000.sum(3, 4), 7);
    }

}