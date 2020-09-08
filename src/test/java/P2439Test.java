import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2439Test {
    @Test
    public void getAnswer() {
        assertEquals("    *\n" +
                "   **\n" +
                "  ***\n" +
                " ****\n" +
                "*****\n", P2439.getAnswer(5));
    }
}