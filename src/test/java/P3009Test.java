import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3009Test {
    @Test
    void getFourthPoint(){
        Dot dot1 = new Dot(30, 20);
        Dot dot2 = new Dot(10, 10);
        Dot dot3 = new Dot(10, 20);
        assertEquals(new Dot(30, 10), P3009.getFourthPoint(dot1, dot2, dot3));
    }
}