import java.io.*;

public class P2156 {
    static int wine[];
    static int n;

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        wine = new int[n];
        for (int i = 0; i < n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }

    private static int dp() {
        if(n==1){
            return wine[0];
        }
        int dp[] = new int[n];
        int a, b, c;
        dp[0] = wine[0];
        dp[1] = wine[0] + wine[1];
        for (int i = 2; i < n; i++) {
            a = ((i > 2) ? dp[i - 3] : 0) + wine[i - 1] + wine[i];
            b = dp[i - 2] + wine[i];
            c = dp[i - 1];
            dp[i] = Math.max(Math.max(a, b), c);
        }
        return dp[n - 1];
    }
}
