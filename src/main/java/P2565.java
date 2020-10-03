import java.io.*;
import java.util.StringTokenizer;

public class P2565 {
    static int n;
    static int lineA[];
    static int lineB[];

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        lineA = new int[n];
        lineB = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            lineA[i] = Integer.valueOf(tokenizer.nextToken());
            lineB[i] = Integer.valueOf(tokenizer.nextToken());
        }
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }

    public static void sort(int left, int right){
        int l=left, r=right;
        if(l >= r){
            return;
        }
        int middle = (l+r)/2;
        int pivot = lineA[middle];
        while (l < r){
            while ((l <= r) && (lineA[l] < pivot)) ++l;
            while ((l <= r) && (lineA[r] > pivot)) --r;
            int tmp = lineA[l];
            lineA[l] = lineA[r];
            lineA[r] = tmp;
            tmp = lineB[l];
            lineB[l] = lineB[r];
            lineB[r] = tmp;
            sort(left,r-1);
            sort(r+1,right);
        }
    }
    public static int dp() {
        sort(0, n-1);
        int dp[] = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; ++i) {
            dp[i] = 1;
            for(int j=0; j<i; ++j){
                if((lineB[i] > lineB[j]) && (dp[i] <= dp[j])){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i: dp){
            max = Math.max(max, i);
        }
        return n-max;
    }
}
