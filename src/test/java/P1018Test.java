import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class P1018Test {
    char[][] stringToMatrix(String input){
        char[][] result;
        StringTokenizer lineTokenizer = new StringTokenizer(input, "\n");
        int lineNum = lineTokenizer.countTokens();
        result = new char[lineNum][];
        for(int line=0; line < lineNum; line++){
            String lineStr = lineTokenizer.nextToken();
            result[line] = lineStr.toCharArray();
        }
        return result;
    }
    @Test
    void getMinChessPaint(){
        char[][] input1 = stringToMatrix("WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBBBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW");
        assertEquals(1, P1018.getMinChessPaint(input1));
        char[][] input2 = stringToMatrix("BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "WWWWWWWWWWBWB\n" +
                "WWWWWWWWWWBWB");
        assertEquals(12, P1018.getMinChessPaint(input2));
    }

    @Test
    void count8by8ChessPaintNum(){
        char[][] input1 = stringToMatrix("WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBBBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW");
        assertEquals(1, P1018.count8by8ChessPaintNum(input1, 0, 0, 'W'));
        assertEquals(63, P1018.count8by8ChessPaintNum(input1, 0, 0, 'B'));
    }
}