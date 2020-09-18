import java.io.*;

public class P10872 {
    public static int factorial(int i) {
        if (i== 0 ||i == 1){
            return 1;
        }
        return i * factorial(i-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int f = factorial(n);
        bw.write(String.valueOf(f));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
