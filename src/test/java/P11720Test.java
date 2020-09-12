import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P11720Test {
    @Test
    void digitSum(){
        assertEquals(1, P11720.digitSum("1"));
        assertEquals(15, P11720.digitSum("54321"));
        assertEquals(7, P11720.digitSum("7000000000000000000000000"));
        assertEquals(46, P11720.digitSum("10987654321"));
    }
}