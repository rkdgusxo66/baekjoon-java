import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class P14889Test {
    @Test
    void backtrackTest(){
        P14889.min = Integer.MAX_VALUE;
        P14889.startTeamScore=0; P14889.linkTeamScore=0;
        P14889.startTeam = new Stack<Integer>();
        P14889.linkTeam = new Stack<Integer>();
        P14889.stringToMat(
                "0 1 2 3\n" +
                "4 0 5 6\n" +
                "7 1 0 2\n" +
                "3 4 5 0", 4);
        P14889.backtrack(0);
        assertEquals(0, P14889.min);

        P14889.min = Integer.MAX_VALUE;
        P14889.startTeamScore=0; P14889.linkTeamScore=0;
        P14889.startTeam = new Stack<Integer>();
        P14889.linkTeam = new Stack<Integer>();
        P14889.stringToMat(
                "0 1 2 3 4 5\n" +
                        "1 0 2 3 4 5\n" +
                        "1 2 0 3 4 5\n" +
                        "1 2 3 0 4 5\n" +
                        "1 2 3 4 0 5\n" +
                        "1 2 3 4 5 0", 6);
        P14889.backtrack(0);
        assertEquals(2, P14889.min);

        P14889.min = Integer.MAX_VALUE;
        P14889.startTeamScore=0; P14889.linkTeamScore=0;
        P14889.startTeam = new Stack<Integer>();
        P14889.linkTeam = new Stack<Integer>();
        P14889.stringToMat(
                "0 5 4 5 4 5 4 5\n" +
                        "4 0 5 1 2 3 4 5\n" +
                        "9 8 0 1 2 3 1 2\n" +
                        "9 9 9 0 9 9 9 9\n" +
                        "1 1 1 1 0 1 1 1\n" +
                        "8 7 6 5 4 0 3 2\n" +
                        "9 1 9 1 9 1 0 9\n" +
                        "6 5 4 3 2 1 9 0", 8);
        P14889.backtrack(0);
        assertEquals(1, P14889.min);
    }
}