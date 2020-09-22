import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class P15651Test {
    ArrayList<ArrayList<Integer>> parseOutput(String output) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        StringTokenizer lineTokenizer = new StringTokenizer(output, "\n");
        while (lineTokenizer.hasMoreTokens()) {
            ArrayList<Integer> nums = new ArrayList<>();
            StringTokenizer numTokenizer = new StringTokenizer(lineTokenizer.nextToken(), " ");
            while (numTokenizer.hasMoreTokens()) {
                nums.add(Integer.parseInt(numTokenizer.nextToken()));
            }
            results.add(nums);
        }
        return results;
    }

    @Test
    void getAnswerTest() {
        assertIterableEquals(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3)
        ), P15651.getAnswer(3, 1));

        assertIterableEquals(parseOutput(
                "1 1\n" +
                        "1 2\n" +
                        "1 3\n" +
                        "1 4\n" +
                        "2 1\n" +
                        "2 2\n" +
                        "2 3\n" +
                        "2 4\n" +
                        "3 1\n" +
                        "3 2\n" +
                        "3 3\n" +
                        "3 4\n" +
                        "4 1\n" +
                        "4 2\n" +
                        "4 3\n" +
                        "4 4"
        ), P15651.getAnswer(4, 2));

        assertIterableEquals(parseOutput(
                "1 1 1\n" +
                        "1 1 2\n" +
                        "1 1 3\n" +
                        "1 2 1\n" +
                        "1 2 2\n" +
                        "1 2 3\n" +
                        "1 3 1\n" +
                        "1 3 2\n" +
                        "1 3 3\n" +
                        "2 1 1\n" +
                        "2 1 2\n" +
                        "2 1 3\n" +
                        "2 2 1\n" +
                        "2 2 2\n" +
                        "2 2 3\n" +
                        "2 3 1\n" +
                        "2 3 2\n" +
                        "2 3 3\n" +
                        "3 1 1\n" +
                        "3 1 2\n" +
                        "3 1 3\n" +
                        "3 2 1\n" +
                        "3 2 2\n" +
                        "3 2 3\n" +
                        "3 3 1\n" +
                        "3 3 2\n" +
                        "3 3 3"
        ), P15651.getAnswer(3, 3));
    }
}