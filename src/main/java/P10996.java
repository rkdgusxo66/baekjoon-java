import java.io.*;

public class P10996 {
    public static String printStar(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    sb.append("*");
                } else {
                    if (j != n - 1) {
                        sb.append(" ");
                    }
                }
            }
            if (n != 1)
                sb.append("\n");
            for (int j = 0; j < n; j++) {
                if (j % 2 == 1) {
                    sb.append("*");
                } else {
                    if (j != n - 1) {
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(printStar(n));
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
