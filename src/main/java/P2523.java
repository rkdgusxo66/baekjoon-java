import java.io.*;

public class P2523 {
    public static String printStar(int n) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
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
        bw.write(printStar(n));
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
