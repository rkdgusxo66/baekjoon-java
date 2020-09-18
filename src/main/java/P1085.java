import java.io.*;
import java.util.StringTokenizer;

public class P1085 {
    public static int getShortestDistance(int x, int y, int w, int h) {
        int min = Integer.MAX_VALUE;
        if (min > w-x)
            min = w-x;
        if (min > h-y)
            min = h-y;
        if (min > x)
            min = x;
        if (min > y)
            min = y;
        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());
        int h = Integer.parseInt(tokenizer.nextToken());
        int distance = getShortestDistance(x, y, w, h);
        bw.write(String.valueOf(distance));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
