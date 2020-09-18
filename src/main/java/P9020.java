import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class P9020 {
    public static ArrayList<Integer> getGoldbachPartition(int n) {
        ArrayList<Integer> result = new ArrayList<>(2);
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for(int i=2; i<=n/2; i++){
            for(int j=2; j<=n/i; j++){
                isPrime[i * j] = false;
            }
        }
        int half = n/2;
        int left = half;
        int right = half;
        while (!isPrime[left] || !isPrime[right]){
            --left;
            ++right;
        }
        result.add(left);
        result.add(right);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        while (i > 0){
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> result = getGoldbachPartition(n);
            bw.write(result.get(0) + " " + result.get(1));
            bw.newLine();
            --i;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
