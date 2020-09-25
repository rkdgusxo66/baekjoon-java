import java.io.*;

public class P9663 {
    static int result = 0;
    static int nthLineQueen[];

    public static int backtrack(int currentLine, int n) {
        if (currentLine == n) {
            result += 1;
            return result;
        }
        for (int col = 0; col < n; col++) {
            if (isPromising(currentLine, col)) {
                nthLineQueen[currentLine] = col;
                backtrack(currentLine+1, n);
            }
        }
        return result;
    }

    public static boolean isPromising(int line, int col) {
        for (int i = 0; i < line; i++) {
            if (nthLineQueen[i] == col || Math.abs(nthLineQueen[i] - col) == Math.abs(i - line)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        result=0;
        nthLineQueen = new int[n];
        int ans = backtrack(0, n);
        bw.write(String.valueOf(ans));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
