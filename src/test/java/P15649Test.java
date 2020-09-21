import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P15649Test {
    @Test
    void getAnswer(){
        assertIterableEquals(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3)
        ), P15649.getAnswer(3, 1));

        assertIterableEquals(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 1),
                Arrays.asList(2, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 1),
                Arrays.asList(3, 2),
                Arrays.asList(3, 4),
                Arrays.asList(4, 1),
                Arrays.asList(4, 2),
                Arrays.asList(4, 3)
        ), P15649.getAnswer(4, 2));
    }
}