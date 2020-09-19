import java.io.*;
import java.util.Arrays;

public class P2447 {
    public static void pasteStar(char[][] dest, char[][] source, int x, int y) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length; j++) {
                dest[x + i][y + j] = source[i][j];
            }
        }
    }

    public static char[][] printStarRecur(int n) {
        char[][] result = new char[n][];
        for (int i = 0; i < n; i++) {
            result[i] = new char[n];
            Arrays.fill(result[i], ' ');
        }
        if (n == 1) {
            result[0][0] = '*';
            return result;
        }
        char[][] prev = printStarRecur(n / 3);
        int width = prev[0].length;
        int height = prev.length;
        pasteStar(result, prev, 0, 0);
        pasteStar(result, prev, width, 0);
        pasteStar(result, prev, 2 * width, 0);

        pasteStar(result, prev, 0, height);
        pasteStar(result, prev, 2 * width, height);

        pasteStar(result, prev, 0, 2 * height);
        pasteStar(result, prev, width, 2 * height);
        pasteStar(result, prev, 2 * width, 2 * height);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[][] star = printStarRecur(n);
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                bw.write(star[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
