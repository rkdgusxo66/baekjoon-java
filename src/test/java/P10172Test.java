import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10172Test {
    static final String dog = "|\\_/|\n" +
            "|q p|   /}\n" +
            "( 0 )\"\"\"\\\n" +
            "|\"^\"`    |\n" +
            "||_/=\\\\__|";
    @Test
    public void getDogShape() {
        String dogShape = P10172.getDogShape();
        assertEquals(dog, dogShape);
    }
}