import java.io.*;
import java.util.Arrays;

public class P1546 {
    public static double getNewAverage(int[] scores) {
        int max = Integer.MIN_VALUE;
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        for (int i = 0; i < scores.length; i++) {
            sum += (scores[i] / (double)max) * 100;
        }
        return (sum / scores.length);
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String numStr[] = br.readLine().split(" ");
        int nums[] = Arrays.asList(numStr).stream().mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(getNewAverage(nums)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
