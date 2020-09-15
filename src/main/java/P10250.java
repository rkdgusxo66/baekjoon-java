import java.io.*;
import java.util.StringTokenizer;

public class P10250 {
    public static int getRoomNumber(int h, int w, int n) {
        int floor = (n - (n/h)*h) + ((n%h==0)?h:0) ;
        floor *= 100;
        int roomNum = (int) Math.ceil(n / (double) h);
        return floor + roomNum;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int l = Integer.valueOf(br.readLine());
        while (l > 0) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(tokenizer.nextToken());
            int w = Integer.parseInt(tokenizer.nextToken());
            int n = Integer.parseInt(tokenizer.nextToken());
            bw.write(String.valueOf(getRoomNumber(h, w, n)));
            bw.newLine();
            --l;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
