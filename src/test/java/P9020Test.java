import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P9020Test {
    @Test
    void getGoldbachPartition(){
        assertIterableEquals(Arrays.asList(3, 5), P9020.getGoldbachPartition(8));
        assertIterableEquals(Arrays.asList(5, 5), P9020.getGoldbachPartition(10));
        assertIterableEquals(Arrays.asList(5, 11), P9020.getGoldbachPartition(16));
    }
}