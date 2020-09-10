import java.io.*;

public class P2562 {
    public static int[] getMaxAndOrder(int[] nums) {
        int max = Integer.MIN_VALUE;
        int order = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                order = i + 1;
            }
        }
        return new int[]{max, order};
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        int nums[] = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        int output[] = getMaxAndOrder(nums);
        bw.write(String.valueOf(output[0]));
        bw.newLine();
        bw.write(String.valueOf(output[1]));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
