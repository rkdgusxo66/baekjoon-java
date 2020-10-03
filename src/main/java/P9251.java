import java.io.*;

public class P9251 {
    static String s1,s2;
    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        s1 = br.readLine(); s2 = br.readLine();
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }

    public static int dp(){
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int i=1; i<dp.length; i++){
            for (int j=1; j<dp[i].length; j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
