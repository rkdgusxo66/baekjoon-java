import java.io.*;

public class P2775 {
    public static int getResident(int k, int n) {
        if (k == 0){
            return n;
        } else if(n == 1){
            return 1;
        }
        return getResident(k, n-1) + getResident(k-1, n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        while (i > 0){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(getResident(k, n)));
            bw.newLine();
            --i;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
