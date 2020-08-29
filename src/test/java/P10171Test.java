import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10171Test {
    @Test
    public void getCatShape(){
        String catShape = P10171.getCatShape();
        assertEquals("\\    /\\\n" +
                " )  ( ')\n" +
                "(  /  )\n" +
                " \\(__)|", catShape);
    }
}