import java.io.*;
import java.util.Arrays;

public class P9461 {
    static long r[] = new long[101];
    public static long dp(int n){
        Arrays.fill(r, 0);
        r[1] = 1;
        r[2] = 1;
        r[3] = 1;
        r[4] = 2;
        r[5] = 2;
        for(int i=6;i<=n; i++){
            r[i] = r[i-5] + r[i-1];
        }
        return r[n];
    }
    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t >0){
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(dp(n)));
            bw.newLine();
            --t;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
