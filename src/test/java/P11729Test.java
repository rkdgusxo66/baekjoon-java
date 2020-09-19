import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class P11729Test {
    @Test
    void getHanoiProcess(){
        ArrayList<String> result = new ArrayList();
        result.add("1 3");
        result.add("1 2");
        result.add("3 2");
        result.add("1 3");
        result.add("2 1");
        result.add("2 3");
        result.add("1 3");
        assertIterableEquals(result, P11729.getHanoiProcess(3, 1, 3));
    }

}