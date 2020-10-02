import java.io.*;

public class P10844 {
    static int n;

    public static long dp() {
        long mat[][] = new long[n + 1][11];
        for (int i = 1; i <= 9; i++) {
            mat[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    mat[i][j] = (mat[i - 1][j + 1]) % 1000000000;
                } else if (j == 9) {
                    mat[i][j] = (mat[i - 1][j - 1]) % 1000000000;
                } else {
                    mat[i][j] = (mat[i - 1][j-1] + mat[i-1][j+1] ) % 1000000000;
                }
            }
        }
        long sum = 0;
        for (
                int i = 0;
                i <= 9; i++) {
            sum += mat[n][i];
        }
        return sum % 1000000000;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
