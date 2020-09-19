import java.io.*;

public class P2231 {
    public static int getSmallestConstructor(int n) {
        for (int i=1; i<=n; i++){
            int sum = i;
            int rest = i;
            int digit = -1;
            while (rest > 0){
                digit = rest % 10;
                sum += digit;
                rest /= 10;
            }
            if (sum == n){
                return i;
            }
        }
        return 0;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(getSmallestConstructor(n)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
