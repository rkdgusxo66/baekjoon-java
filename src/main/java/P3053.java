import java.io.*;

public class P3053 {

    public static double getEuclidRound(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double getTexiGeometryRound(int r) {
        return Math.pow(2*r, 2)/2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(getEuclidRound(r)));
        bw.newLine();
        bw.write(String.valueOf(getTexiGeometryRound(r)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
