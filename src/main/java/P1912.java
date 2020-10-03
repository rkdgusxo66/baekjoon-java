import java.io.*;
import java.util.StringTokenizer;

public class P1912 {
    static int n;
    static int nums[];

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.valueOf(br.readLine());
        nums = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.valueOf(tokenizer.nextToken());
        }
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }

    public static int dp() {
        int dp[] = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; ++i) {
            dp[i] = dp[i-1] + nums[i];
            if(dp[i-1]+nums[i] < nums[i]){
                dp[i] = nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int num: dp){
            max = Math.max(max, num);
        }
        return max;
    }
}
