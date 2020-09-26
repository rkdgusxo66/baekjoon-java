import java.io.*;
import java.util.Arrays;

public class P2748 {
    public static long memo[] = new long[91];
    public static long fibo(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (memo[n] != 0){
            return memo[n];
        }
        memo[n] = fibo(n-1) + fibo(n-2);
        return memo[n];
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Arrays.fill(memo, 0);
        bw.write(String.valueOf(fibo(n)));
        bw.newLine();
        bw.close();
        br.close();
        return;
    }
}
