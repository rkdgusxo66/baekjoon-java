import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P15652Test {
    @Test
    void isPromisingTest(){
        assertEquals(true, P15652.isPromising(1));
        P15652.visited[1] = true;
        assertEquals(true, P15652.isPromising(1));
        P15652.visited[2] = true;
        assertEquals(false, P15652.isPromising(1));
        assertEquals(true, P15652.isPromising(2));
        assertEquals(true, P15652.isPromising(3));
    }

    @Test
    void backtrackTest1(){
        ArrayList<ArrayList<Integer>> output1 = new ArrayList<ArrayList<Integer>>();
        output1.add(new ArrayList<>(Arrays.asList(1)));
        output1.add(new ArrayList<>(Arrays.asList(2)));
        output1.add(new ArrayList<>(Arrays.asList(3)));
        assertEquals(output1, P15652.backtrack(3, 1));
    }

    @Test
    void backtrackTest2(){
        ArrayList<ArrayList<Integer>> output2 = new ArrayList<ArrayList<Integer>>();
        output2.add(new ArrayList<>(Arrays.asList(1, 1)));
        output2.add(new ArrayList<>(Arrays.asList(1, 2)));
        output2.add(new ArrayList<>(Arrays.asList(1, 3)));
        output2.add(new ArrayList<>(Arrays.asList(1, 4)));
        output2.add(new ArrayList<>(Arrays.asList(2, 2)));
        output2.add(new ArrayList<>(Arrays.asList(2, 3)));
        output2.add(new ArrayList<>(Arrays.asList(2, 4)));
        output2.add(new ArrayList<>(Arrays.asList(3, 3)));
        output2.add(new ArrayList<>(Arrays.asList(3, 4)));
        output2.add(new ArrayList<>(Arrays.asList(4, 4)));
        assertEquals(output2, P15652.backtrack(4, 2));
    }

    @Test
    void backtrackTest3(){
        ArrayList<ArrayList<Integer>> output2 = new ArrayList<ArrayList<Integer>>();
        output2.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        output2.add(new ArrayList<>(Arrays.asList(1, 1, 2)));
        output2.add(new ArrayList<>(Arrays.asList(1, 1, 3)));
        output2.add(new ArrayList<>(Arrays.asList(1, 2, 2)));
        output2.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        output2.add(new ArrayList<>(Arrays.asList(1, 3, 3)));
        output2.add(new ArrayList<>(Arrays.asList(2, 2, 2)));
        output2.add(new ArrayList<>(Arrays.asList(2, 2, 3)));
        output2.add(new ArrayList<>(Arrays.asList(2, 3, 3)));
        output2.add(new ArrayList<>(Arrays.asList(3, 3, 3)));
        assertEquals(output2, P15652.backtrack(3, 3));
    }    @BeforeEach
    void init(){
        Arrays.fill(P15652.visited, false);
        P15652.history.clear();
        P15652.results.clear();
    }
}