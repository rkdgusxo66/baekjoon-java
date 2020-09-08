import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P10871 {
    public static Integer[] getAnswer(int x, Integer[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] < x){
                ans.add(nums[i]);
            }
        }
        return ans.toArray(new Integer[]{ 0 });
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String splitted[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(splitted[1]);
        Integer nums[] = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Integer[] answer = getAnswer(x, nums);
        String tmp[] = new String[answer.length];
        for(int i=0; i< answer.length; i++){
            tmp[i] = answer[i].toString();
        }
        bw.write(String.join(" ", tmp));
        bw.newLine();
        bw.flush();
        return;
    }
}
