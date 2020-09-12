import java.io.*;

public class P11720 {
    public static int digitSum(String s) {
        int sum = 0;
        for(char c: s.toCharArray()){
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(digitSum(br.readLine())));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
