import java.io.*;

public class P1463 {
    static int n;
    static int dp[];
    public static int dp(){
        dp = new int[n+1];
        for(int i=2;i<=n;i++){
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            int c = Integer.MAX_VALUE;
            if(i%3 ==0 ){
                a = dp[i/3] + 1;
            }
            if(i%2 == 0){
                b = dp[i/2] + 1;
            }
            c = dp[i-1] + 1;
            dp[i] = Math.min(Math.min(a,b), c);
        }
        return dp[n];
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
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
