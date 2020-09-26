import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2748Test {
    @Test
    void fiboTest(){
        assertEquals(55, P2748.fibo(10));
        assertEquals(1, P2748.fibo(1));
        assertEquals(0, P2748.fibo(0));
    }
}