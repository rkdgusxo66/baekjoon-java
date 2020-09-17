import java.io.*;
import java.util.Arrays;

public class P4948 {
    public static int getPrimeNumberCount(int n) {
        int count = 0;
        boolean isPrime[] = new boolean[2 * n + 1];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= (2 * n) / i; j++) {
                isPrime[i * j] = false;
            }
        }
        for (int i = n + 1; i <= 2 * n; i++) {
            if (isPrime[i]) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            int numOfPrimeNum = getPrimeNumberCount(n);
            bw.write(String.valueOf(numOfPrimeNum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
