import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2438Test {
    @Test
    public void getAnswer() {
        assertEquals("*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n", P2438.getAnswer(5));
    }
}