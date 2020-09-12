import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1157Test {
    @Test
    void getMostUsedAlpah(){
        assertEquals('?', P1157.getMostUsedAlpha("Mississipi"));
        assertEquals('Z', P1157.getMostUsedAlpha("zZa"));
        assertEquals('Z', P1157.getMostUsedAlpha("z"));
        assertEquals('A', P1157.getMostUsedAlpha("baaa"));
    }
}