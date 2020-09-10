import java.io.*;

public class P2577 {
    public static int[] countNumber(int[] nums) {
        int x = nums[0] * nums[1] * nums[2];
        int counter[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (x > 0) {
            int curDigit = x % 10;
            x /= 10;
            counter[curDigit]++;
        }
        return counter;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nums[] = new int[3];
        for(int i = 0; i < 3; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        int counter[] = countNumber(nums);
        for(int count : counter){
            bw.write(String.valueOf(count));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
