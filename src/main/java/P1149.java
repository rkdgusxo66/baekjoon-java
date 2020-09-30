import java.io.*;
import java.util.StringTokenizer;

public class P1149 {
    static int n;
    static int cost[][];

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        for(int i=0;i<n;i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(tokenizer.nextToken());
            int g = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            cost[i][0] = r;
            cost[i][1] = g;
            cost[i][2] = b;
        }
        bw.write(String.valueOf(dp()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }

    private static int dp() {
        int minMap[][] = new int[n][3];
        minMap[0][0] = cost[0][0]; minMap[0][1] = cost[0][1];minMap[0][2] = cost[0][2];
        for(int i=1; i<n; i++){
            minMap[i][0] = Math.min(minMap[i-1][1], minMap[i-1][2]) + cost[i][0];
            minMap[i][1] = Math.min(minMap[i-1][0], minMap[i-1][2]) + cost[i][1];
            minMap[i][2] = Math.min(minMap[i-1][0], minMap[i-1][1]) + cost[i][2];
        }

        return Math.min(Math.min(minMap[n-1][0], minMap[n-1][1]), minMap[n-1][2]);
    }
}
