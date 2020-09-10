import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10996Test {
    @Test
    public void printStar(){
        assertEquals("*\n", P10996.printStar(1));
        assertEquals("*\n" +
                " *\n" +
                "*\n" +
                " *\n", P10996.printStar(2));
        assertEquals("* *\n" +
                " *\n" +
                "* *\n" +
                " *\n" +
                "* *\n" +
                " *\n", P10996.printStar(3));
    }
}