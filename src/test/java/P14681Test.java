import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P14681Test {
    @Test
    public void convertToQuadrant(){
        assertEquals(1, P14681.convertToQuaddrant(12, 5));
        assertEquals(4, P14681.convertToQuaddrant(9, -13));
        assertEquals(3, P14681.convertToQuaddrant(-3, -9));
        assertEquals(2, P14681.convertToQuaddrant(-33, 1));
    }
}