import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P4673Test {
    @Test
    void d(){
        List result = P4673.d(100);
        assertArrayEquals(new Integer[]{1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97},
                result.toArray(new Integer[result.size()]));
    }
}