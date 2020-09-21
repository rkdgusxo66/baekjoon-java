import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P11650Test {
    @Test
    void sortCoordinates(){
        assertIterableEquals(
                Arrays.asList(-100, 1, 3, 4),
                P11650.sortCoordinates(Arrays.asList(-100, 3, 4, 1))
        );
        List<Coordinate> input1 = Arrays.asList(
                Coordinate.of(3, 4),
                Coordinate.of(1, 1),
                Coordinate.of(1, -1),
                Coordinate.of(2, 2),
                Coordinate.of(3, 3));
        List<Coordinate> output1 = Arrays.asList(
                Coordinate.of(1, -1),
                Coordinate.of(1, 1),
                Coordinate.of(2, 2),
                Coordinate.of(3, 3),
                Coordinate.of(3, 4));
        assertIterableEquals(output1, P11650.sortCoordinates(input1));

        assertIterableEquals(
                Arrays.asList(Coordinate.of(1,2)),
                P11650.sortCoordinates(Arrays.asList(
                        Coordinate.of(1,2)
                ))
        );

        assertIterableEquals(
                Arrays.asList(
                        Coordinate.of(-100,111),
                        Coordinate.of(1,2),
                        Coordinate.of(3,1),
                        Coordinate.of(3,2)
                ),
                P11650.sortCoordinates(Arrays.asList(
                        Coordinate.of(-100,111),
                        Coordinate.of(3,1),
                        Coordinate.of(3,2),
                        Coordinate.of(1,2)
                        ))
        );
    }

    @Test
    void coordinateCompareToTest(){
        assertTrue(Coordinate.of(1, 2).compareTo(Coordinate.of(1, 3))<0);
        assertTrue(Coordinate.of(1, 2).compareTo(Coordinate.of(1, 2))==0);
        assertTrue(Coordinate.of(2, 2).compareTo(Coordinate.of(1, 2))>0);
        assertTrue(Coordinate.of(1, 1).compareTo(Coordinate.of(2, 1))<0);
    }
}