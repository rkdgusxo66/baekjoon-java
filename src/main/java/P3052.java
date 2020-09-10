import java.io.*;

public class P3052 {
    public static int countDigit(int[] nums) {
        boolean exist[] = new boolean[42];
        int count = 0;
        for(int i = 0; i < exist.length; i++){
            exist[i] = false;
        }
        for(int num: nums){
            int rest = num % 42;
            if(!exist[rest]){
                count++;
                exist[rest] = true;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nums[] = new int[10];
        for(int i=0; i<10; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        bw.write(String.valueOf(countDigit(nums)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
