import java.io.*;

public class P1904 {
    public static long dp(int n){
        if(n ==1){
            return 1;
        }
        if(n ==2){
            return 2;
        }
        int d[] = new int[n+1];
        d[1]=1; d[2]=2;
        for (int i=3; i<=n; i++){
            d[i] = d[i-1] + d[i-2];
            d[i] %= 15746;
        }
        return d[n];
    }
    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(dp(n)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
