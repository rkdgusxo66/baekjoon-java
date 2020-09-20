import java.io.*;
import java.util.Arrays;

public class P10989 {

    public static int[] sort(int[] input) {
        int numCount[] = new int[10000001];
        int result[] = new int[input.length];
        int idx = 0;
        Arrays.fill(numCount, 0);
        for (int i = 0; i < input.length; i++) {
            ++numCount[input[i]];
        }
        for (int i = 1; i < numCount.length; i++) {
            for(int j=0; j<numCount[i];j++){
                result[idx++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        int result[] = sort(input);
        for (int x : result) {
            bw.write(String.valueOf(x));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
