import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1181Test {
    @Test
    void qsortWithOverlapTest(){
        assertArrayEquals(new Integer[]{1,2,3,3,4,5,5},
                P1181.qsortWithOverlap(new Integer[]{5,4,5,2,1,3,3}, 0, 6, Integer::compareTo));
    }

    @Test
    void sortUniqueWithComparatorTest(){
        String input[] = new String[]{
                "but",
                "i",
                "wont",
                "hesitate",
                "no",
                "more",
                "no",
                "more",
                "it",
                "cannot",
                "wait",
                "im",
                "yours"
        };
        String output[] = new String[]{
                "i",
                "im",
                "it",
                "no",
                "but",
                "more",
                "wait",
                "wont",
                "yours",
                "cannot",
                "hesitate"
        };
        assertArrayEquals(output, P1181.sortUniqueWithComparator(input));
    }
}