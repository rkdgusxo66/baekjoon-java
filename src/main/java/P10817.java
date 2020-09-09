import java.io.*;

public class P10817 {
    public static int getSecondBigger(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if(a < b) {
            if(b < c){
                return b;
            } else if(a < c){
                return c;
            } else {
                return a;
            }
        } else {
            if (a < c){
                return a;
            } else if(b < c) {
                return c;
            } else {
                return b;
            }
        }
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numbers[] = new int[3];
        String nums[] = br.readLine().split(" ");
        for(int i=0; i< numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        bw.write(String.valueOf(getSecondBigger(numbers)));
        bw.newLine();
        bw.close();
        br.close();
        return;
    }
}
