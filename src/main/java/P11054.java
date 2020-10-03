import java.io.*;
import java.util.StringTokenizer;

public class P11054 {
    static int n;
    static int seq[];

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        seq = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(tokenizer.nextToken());
        }
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }

    private static int dp() {
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        dp1[0] = 1;
        for (int i = 1; i < n; ++i) {
            dp1[i] = 1;
            for (int j = 0; j < i; ++j) {
                if ((seq[i] > seq[j]) && (dp1[i] <= dp1[j])) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }
        dp2[n - 1] = 1;
        for (int i = n - 2; i >= 0; --i) {
            dp2[i] = 1;
            for (int j=n-1; j>i; --j){
                if((seq[i] > seq[j]) && (dp2[i] <= dp2[j])){
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n; ++i){
            max = Math.max(max, dp1[i] + dp2[i]);
        }
        return max-1;
    }
}
