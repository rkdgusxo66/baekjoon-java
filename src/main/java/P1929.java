import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P1929 {
    public static List<Integer> getPrimeNumbers(int m, int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for (int i = 2; i <= n / 2; i++) {
            for (int j = 2; j <= n / i; j++) {
                isPrime[i * j] = false;
            }
        }
        List<Integer> result = new ArrayList();
        for(int i=m; i<=n; i++){
            if(isPrime[i]){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int m = Integer.valueOf(tokenizer.nextToken());
        int n = Integer.valueOf(tokenizer.nextToken());
        List<Integer> primeNumbers = getPrimeNumbers(m, n);
        for(int primeNumber: primeNumbers){
            bw.write(String.valueOf(primeNumber));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
