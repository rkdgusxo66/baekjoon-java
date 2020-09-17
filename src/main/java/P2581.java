import java.io.*;
import java.util.Arrays;

public class P2581 {
    public static int[] getPrimeNumberSumAndMin(int m, int n) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for (int i = 2; i <= n / 2; i++) {
            for (int j = 2; j <= n / i; j++) {
                isPrime[i * j] = false;
            }
        }
        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (min == Integer.MAX_VALUE){
            return new int[]{-1, -1};
        }
        return new int[]{sum, min};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int answer[] = getPrimeNumberSumAndMin(m, n);
        bw.write(String.valueOf(answer[0]));
        bw.newLine();
        if(answer[1] != -1){
            bw.write(String.valueOf(answer[1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
