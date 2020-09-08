import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2742Test {
    @Test
    public void getAnswer(){
        assertEquals("5\n4\n3\n2\n1\n", P2742.getAnswer(5));
        assertEquals("4\n3\n2\n1\n", P2742.getAnswer(4));
    }
}