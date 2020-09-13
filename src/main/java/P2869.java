import java.io.*;
import java.util.StringTokenizer;

public class P2869 {

    public static int calculateTakingDays(int a, int b, int v) {
        return (int)Math.ceil((double)(v-a)/(double)(a-b)) + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        int v = Integer.parseInt(tokenizer.nextToken());
        bw.write(String.valueOf(calculateTakingDays(a, b, v)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
