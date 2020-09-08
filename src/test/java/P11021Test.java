import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P11021Test {
    @Test
    public void getAnswer(){
        assertEquals(2, P11021.getAnswer(1, 1));
        assertEquals(5, P11021.getAnswer(2, 3));
    }
}