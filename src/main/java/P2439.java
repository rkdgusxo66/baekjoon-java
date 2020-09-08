import java.io.*;

public class P2439 {
    public static String getAnswer(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                sb.append(" ");
            }
            for(int j=n-i-1; j<n; j++){
                sb.append("*");
            }
            sb.append("\n");
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
