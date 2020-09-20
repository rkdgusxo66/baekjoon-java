import java.io.*;
import java.util.Arrays;

public class P2108 {
    public static int[] getStatistics(int[] input) {
        int mean, center, mostAppear, range, maxAppearCount=0;
        boolean findFirst;
        int appearCount[] = new int[8001];
        mean = (int)Math.round(Arrays.stream(input).sum() / (double)input.length);

        Arrays.sort(input);
        center = input[input.length/2];

        Arrays.fill(appearCount, 0);
        for(int i=0; i<input.length; i++){
            ++appearCount[input[i]+4000];
            if(maxAppearCount < appearCount[input[i]+4000]){
                maxAppearCount = appearCount[input[i]+4000];
            }
        }
        findFirst = false;
        mostAppear = input[0];
        for(int i=-4000; i<=4000; i++){
            if (appearCount[i+4000] == maxAppearCount){
                mostAppear = i;
                if(findFirst){
                    break;
                }
                findFirst = true;
            }
        }

        range = input[input.length-1] - input[0];

        return new int[]{mean, center, mostAppear, range};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int input[] = new int[n];
        for (int i=0;i<n ;i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        int output[] = getStatistics(input);
        for (int val: output){
            bw.write(String.valueOf(val));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
