import java.io.*;

public class P10039 {

    public static int getAverage(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 40){
                sum += 40;
            } else {
                sum += nums[i];
            }
        }
        return sum / nums.length;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int scores[] = new int[5];
        for(int i=0;i<5; i++){
            scores[i] = Integer.parseInt(br.readLine());
        }
        bw.write(String.valueOf(getAverage(scores)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
