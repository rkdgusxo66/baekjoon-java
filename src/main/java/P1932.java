import java.io.*;
import java.util.StringTokenizer;

public class P1932 {
    static int n;
    static int mat[][];
    static int dp[][];

    public static int dp(){
        dp = new int[n][n];
        dp[0] = mat[0];
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                int left = j>0 ? dp[i-1][j-1] : 0;
                int right = i!=j ? dp[i-1][j] : 0;
                dp[i][j] = Math.max(left, right) + mat[i][j];
            }
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (max < dp[n-1][i]){
                max = dp[n-1][i];
            }
        }
        return max;
    }
    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        mat = new int[n][n];
        for(int i=0;i<n ;i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for(int j=0;tokenizer.hasMoreTokens();++j){
                mat[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
