import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P2580 {
    static int mat[][] = new int[9][9];

    public static int[][] stringToMat(String s) {
        StringTokenizer lineTokenizer = new StringTokenizer(s, "\n");
        int result[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer numTokenizer = new StringTokenizer(lineTokenizer.nextToken());
            for (int j = 0; j < 9; j++) {
                result[i][j] = Integer.parseInt(numTokenizer.nextToken());
            }
        }
        return result;
    }

    public static boolean isPromising(int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (mat[row][i] == num || mat[i][col] == num) {
                return false;
            }
        }
        int rowStart = 3 * (row / 3);
        int colStart = 3 * (col / 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[rowStart + i][colStart + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean backtrack(int row, int col) {
        int i=row, j=col;
        while (i < 9){
            while (j < 9){
                if (mat[i][j] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isPromising(i, j, num)) {
                            mat[i][j] = num;
                            if (backtrack(i, j + 1)) {
                                return true;
                            }
                            mat[i][j] = 0;
                        }
                    }
                    return false;
                }
                j++;
            }
            j=0;
            i++;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<9;i++){
            sb.append(br.readLine());
            sb.append("\n");
        }
        mat = stringToMat(sb.toString());
        backtrack(0, 0);
        for(int i=0;i<9;i++){
            bw.write(Arrays.stream(mat[i])
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" ")));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
