import java.io.*;
import java.util.StringTokenizer;

public class P1011 {
    public static long getMinJump(long x, long y) {
        long distance = y-x;
        long tmp = (long)Math.ceil(Math.sqrt(distance));
        long right =(long)Math.pow(tmp, 2);
        long left = (long)Math.pow(tmp -1, 2);
        long mid = (right + left) / 2;
        if (distance == left) {
            return 2 * (tmp - 1) -1;
        } else if(distance <= mid) {
            return 2 * (tmp -1);
        } else {
            return 2 * (tmp -1) + 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 0){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            bw.write(String.valueOf(getMinJump(x, y)));
            bw.newLine();
            --n;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
