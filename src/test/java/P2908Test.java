import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2908Test {
    @Test
    void getSangsuAnswer(){
        assertEquals(437, P2908.getSangsuAnswer(734, 893));
        assertEquals(123, P2908.getSangsuAnswer(321, 411));
    }
}