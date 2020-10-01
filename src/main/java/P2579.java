import java.io.*;

public class P2579 {
    static int[] points;
    static int[][] memo;
    static int n;
    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        points = new int[n];
        memo = new int[n+1][n+1];
        for(int i=0;i< n ;i++){
            points[i] = Integer.parseInt(br.readLine());
        }
        bw.write(String.valueOf(dp(n-1, 0)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }

    public static int dp(int i, int prev){
        if (i < 0) {
            return 0;
        }
        if(memo[i][prev] != 0){
            return memo[i][prev];
        }
        int a=0, b=0;
        if(prev-1 != i){
            a = dp(i-1, i);
        }
        b = dp(i-2, i);
        int r = Math.max(a, b) + points[i];
        memo[i][prev] = r;
        return r;
    }
}
