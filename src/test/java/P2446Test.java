import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2446Test {
    @Test
    public void printStar(){
        assertEquals("*********\n" +
                " *******\n" +
                "  *****\n" +
                "   ***\n" +
                "    *\n" +
                "   ***\n" +
                "  *****\n" +
                " *******\n" +
                "*********\n", P2446.printStar(5));
    }
}