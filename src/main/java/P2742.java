import java.io.*;

public class P2742 {
    public static String getAnswer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i=n; i>=1; i--) {
            sb.append(i+"\n");
        }
        return sb.toString();
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(getAnswer(n));
        bw.flush();
        return;
    }
}
