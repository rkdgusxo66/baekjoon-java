import java.io.*;

public class P1065 {
    public static int countHanNumber(int n) {
        int hanNumberCount = n;
        for (int i = 1; i <= n; i++) {
            int digit1 = i % 10;
            int rest = i / 10;
            int diff = Integer.MIN_VALUE;
            boolean assigned = false;
            while (rest > 0) {
                int digit2 = rest % 10;
                if(assigned){
                    if(digit1 - digit2 != diff){
                        --hanNumberCount;
                        break;
                    }
                }
                diff = digit1 - digit2;
                digit1 = digit2;
                assigned = true;
                rest /= 10;
            }
        }
        return hanNumberCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(countHanNumber(n)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
