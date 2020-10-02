import java.io.*;
import java.util.StringTokenizer;

public class P11053 {
    static int n;
    static int seq[];
    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        seq = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            seq[i] = Integer.parseInt(tokenizer.nextToken());
        }
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        br.close();
        return;
    }

    // 10 20 10 30 20 50
    private static int dp() {
        int dp[] = new int[n];
        if(n==1){
            return 1;
        }
        dp[0] = 1;
        for(int i=1; i<n;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(seq[i] > seq[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i: dp){
            max = Math.max(max, i);
        }
        return max;
    }
}
