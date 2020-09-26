import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class P2580Test {
    @Test
    void isPromisingTest(){
        P2580.mat = P2580.stringToMat(
                "0 3 5 4 6 9 2 7 8\n" +
                "7 8 2 1 0 5 6 0 9\n" +
                "0 6 0 2 7 8 1 3 5\n" +
                "3 2 1 0 4 6 8 9 7\n" +
                "8 0 4 9 1 3 5 0 6\n" +
                "5 9 6 8 2 0 4 1 3\n" +
                "9 1 7 6 5 2 0 8 0\n" +
                "6 0 3 7 0 1 9 5 2\n" +
                "2 5 8 3 9 4 7 6 0");
        assertTrue(P2580.isPromising(0,0, 1));
        assertFalse(P2580.isPromising(0,0, 7));
        assertFalse(P2580.isPromising(0,0, 8));
        assertFalse(P2580.isPromising(0,0, 2));
        assertFalse(P2580.isPromising(0,0, 6));
    }

    @Test
    void backtrack() throws IOException {
        P2580.mat = P2580.stringToMat(
                "0 3 5 4 6 9 2 7 8\n" +
                        "7 8 2 1 0 5 6 0 9\n" +
                        "0 6 0 2 7 8 1 3 5\n" +
                        "3 2 1 0 4 6 8 9 7\n" +
                        "8 0 4 9 1 3 5 0 6\n" +
                        "5 9 6 8 2 0 4 1 3\n" +
                        "9 1 7 6 5 2 0 8 0\n" +
                        "6 0 3 7 0 1 9 5 2\n" +
                        "2 5 8 3 9 4 7 6 0");
        int [][] ans = P2580.stringToMat(
                "1 3 5 4 6 9 2 7 8\n" +
                        "7 8 2 1 3 5 6 4 9\n" +
                        "4 6 9 2 7 8 1 3 5\n" +
                        "3 2 1 5 4 6 8 9 7\n" +
                        "8 7 4 9 1 3 5 2 6\n" +
                        "5 9 6 8 2 7 4 1 3\n" +
                        "9 1 7 6 5 2 3 8 4\n" +
                        "6 4 3 7 8 1 9 5 2\n" +
                        "2 5 8 3 9 4 7 6 1"
        );
        P2580.backtrack(0, 0);
        assertArrayEquals(ans, P2580.mat);

        P2580.mat = P2580.stringToMat(
                "0 9 2 1 0 5 0 0 4\n" +
                        "0 0 8 0 7 3 5 0 9\n" +
                        "0 5 3 0 4 0 0 2 0\n" +
                        "1 4 0 0 0 0 7 3 6\n" +
                        "0 0 0 7 6 1 4 0 5\n" +
                        "0 7 0 5 0 0 0 0 0\n" +
                        "9 0 0 0 0 7 2 0 0\n" +
                        "0 0 4 0 0 6 0 9 0\n" +
                        "0 0 0 0 0 0 0 0 0");
        ans = P2580.stringToMat(
                "6 9 2 1 8 5 3 7 4\n" +
                        "4 1 8 2 7 3 5 6 9\n" +
                        "7 5 3 6 4 9 1 2 8\n" +
                        "1 4 5 9 2 8 7 3 6\n" +
                        "2 3 9 7 6 1 4 8 5\n" +
                        "8 7 6 5 3 4 9 1 2\n" +
                        "9 6 1 8 5 7 2 4 3\n" +
                        "5 2 4 3 1 6 8 9 7\n" +
                        "3 8 7 4 9 2 6 5 1"
        );
        P2580.backtrack(0, 0);
        assertArrayEquals(ans, P2580.mat);
    }
}