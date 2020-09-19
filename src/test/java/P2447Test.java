import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2447Test {
    char [][] string2chars(String tmp){
        String []splitted = tmp.split("\n");
        int length = splitted.length;
        char[][] result = new char[length][length];
        for(int i=0;i<length; i++){
            result[i] = splitted[i].toCharArray();
        }
        return result;
    }

    @Test
    void printStarRecur(){
        String test1str = "***\n" +
                "* *\n" +
                "***";
        assertArrayEquals(string2chars(test1str), P2447.printStarRecur(3));

        String test2str= "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "***   ******   ******   ***\n" +
                "* *   * ** *   * ** *   * *\n" +
                "***   ******   ******   ***\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "*********         *********\n" +
                "* ** ** *         * ** ** *\n" +
                "*********         *********\n" +
                "***   ***         ***   ***\n" +
                "* *   * *         * *   * *\n" +
                "***   ***         ***   ***\n" +
                "*********         *********\n" +
                "* ** ** *         * ** ** *\n" +
                "*********         *********\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "***   ******   ******   ***\n" +
                "* *   * ** *   * ** *   * *\n" +
                "***   ******   ******   ***\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************";
        assertArrayEquals(string2chars(test2str), P2447.printStarRecur(27));
    }
}