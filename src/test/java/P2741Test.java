import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2741Test {
    @Test
    public void getAnswer(){
        assertEquals("1\n2\n3\n4\n5\n", P2741.getAnswer(5));
        assertEquals("1\n2\n3\n4\n", P2741.getAnswer(4));
    }
}