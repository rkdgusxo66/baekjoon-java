import java.io.*;
import java.util.Arrays;

public class P10818 {
    public static int[] getMinMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }
        return new int[]{min, max};
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String numstr[] = br.readLine().split(" ");
        int nums[] = Arrays.asList(numstr).stream().mapToInt(Integer::parseInt).toArray();
        int minMax[] = getMinMax(nums);
        bw.write(minMax[0] + " " + minMax[1]);
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
