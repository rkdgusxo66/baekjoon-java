import java.io.*;

public class P15552 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String... argv) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String nums[] = (br.readLine()).split(" ");
            int sum = sum(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();

        br.close();
        isr.close();
        bw.close();
        osw.close();
    }
}
