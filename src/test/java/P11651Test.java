import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P11651Test {
    @Test
    void sortTest(){
        assertArrayEquals(new Integer[]{1,2,3,4,5}, P11651.sort(new Integer[]{4,3,5,1,2}, 0, 4));
    }

    @Test
    void coordinateCompareToTest(){
        assertTrue(Coordinate2.of(4,3).compareTo(Coordinate2.of(3, 4)) < 0);
        assertTrue(Coordinate2.of(4,4).compareTo(Coordinate2.of(3, 4)) > 0);
        assertTrue(Coordinate2.of(3,3).compareTo(Coordinate2.of(4, 4)) < 0);
    }

    @Test
    void sortCoordinateTest(){
        Coordinate2[] input = new Coordinate2[]{
                Coordinate2.of(0, 4),
                Coordinate2.of(1, 2),
                Coordinate2.of(1, -1),
                Coordinate2.of(2, 2),
                Coordinate2.of(3, 3)
        };
        Coordinate2[] output = new Coordinate2[]{
                Coordinate2.of(1, -1),
                Coordinate2.of(1, 2),
                Coordinate2.of(2, 2),
                Coordinate2.of(3, 3),
                Coordinate2.of(0, 4)
        };
        assertArrayEquals(output, P11651.sortCoordinate(input));
    }
}