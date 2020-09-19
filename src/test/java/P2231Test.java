import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2231Test {
    @Test
    void getSmallestConstructor(){
        assertEquals(198, P2231.getSmallestConstructor(216));
        assertEquals(0, P2231.getSmallestConstructor(1));
    }
}