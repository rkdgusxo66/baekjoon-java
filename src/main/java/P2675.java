import java.io.*;

public class P2675 {
    public static String repeatAlphaNumeric(int n, String an) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < an.length(); i++) {
            for (int j =0 ;j<n ; j++){
                sb.append(an.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 0){
            String chunks[] = br.readLine().split(" ");
            int r = Integer.parseInt(chunks[0]);
            String s = chunks[1];
            bw.write(repeatAlphaNumeric(r, s));
            bw.newLine();
            --n;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
