import java.io.*;

public class P1110 {
    public static int getCycleLength(int n) {
        int a = n / 10;
        int b = n % 10;
        int ans = (10*b) + (a+b)%10;
        int cycle = 1;
        while(ans != n){
            a = ans / 10;
            b = ans % 10;
            ans = (10*b) + (a+b)%10;
            ++cycle;
        }
        return cycle;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(getCycleLength(n)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
