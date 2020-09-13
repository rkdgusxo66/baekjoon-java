import java.io.*;
import java.util.Arrays;

public class P1712 {
    public static int getBreakEvenPoint(int a, int b, int c) {
        if (b >= c){
            return -1;
        }
        int breakEvenPoint = a/(c-b) + 1;
        return breakEvenPoint;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String splitted[] = br.readLine().split(" ");
        int input[] = Arrays.asList(splitted).stream().mapToInt(Integer::parseInt).toArray();
        int breakEvenPoint = getBreakEvenPoint(input[0], input[1], input[2]);
        bw.write(String.valueOf(breakEvenPoint));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
