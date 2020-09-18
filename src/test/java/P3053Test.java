import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3053Test {
    @Test
    void getEuclidRound(){
        assertEquals(3.141593, P3053.getEuclidRound(1), 0.0001);
    }

    @Test
    void getTaxiGeometryRound(){
        assertEquals(2.000000, P3053.getTexiGeometryRound(1), 0.0001);
    }
}