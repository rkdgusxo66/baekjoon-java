import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P11022Test {
    @Test
    public void getAnswer() {
        assertEquals(2, P11022.getAnswer(1, 1));
        assertEquals(5, P11022.getAnswer(2, 3));
        assertEquals(7, P11022.getAnswer(3, 4));
        assertEquals(17, P11022.getAnswer(9, 8));
        assertEquals(7, P11022.getAnswer(5, 2));
    }
}