import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P7568Test {
    @Test
    void bodyTest(){
        Body newBody = Body.of(1, 2);
        assertNotNull(newBody);
        assertEquals(1, newBody.getWeight());
        assertEquals(2, newBody.getHeight());
    }

    @Test
    void bodyCompareToTest(){
        Body body1 = Body.of(55, 185);
        Body body2 = Body.of(55, 185);
        Body body3 = Body.of(55, 190);
        Body body4 = Body.of(45, 190);
        assertEquals(0, body1.compareTo(body2));
        assertEquals(0, body1.compareTo(body2));
        assertEquals(0, body1.compareTo(body3));
        assertEquals(0, body1.compareTo(body3));
        assertEquals(0, body2.compareTo(body4));

    }

    @Test
    void getBodyRanks(){
        ArrayList<Body> bodies = new ArrayList<>();
        bodies.add(Body.of(55, 185));
        bodies.add(Body.of(58, 183));
        bodies.add(Body.of(88, 186));
        bodies.add(Body.of(60, 175));
        bodies.add(Body.of(46, 155));
        assertIterableEquals(Arrays.asList(2, 2, 1, 2, 5), P7568.getBodyRanks(bodies));
    }
}