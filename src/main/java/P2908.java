import java.io.*;

public class P2908 {
    public static int getSangsuAnswer(int a, int b) {
        int inversedA =0, inversedB = 0;
        while(a > 0){
            inversedA *= 10;
            inversedA += (a % 10);
            a /= 10;
        }
        while(b > 0){
            inversedB *= 10;
            inversedB += (b % 10);
            b /= 10;
        }
        return inversedA > inversedB ? inversedA : inversedB;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String splitted[] = br.readLine().split(" ");
        int a = Integer.parseInt(splitted[0]);
        int b = Integer.parseInt(splitted[1]);
        bw.write(String.valueOf(getSangsuAnswer(a, b)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
