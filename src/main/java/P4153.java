import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4153 {
    public static boolean isPita(double... sides) {
        Arrays.sort(sides);
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        return c*c == a*a + b*b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(tokenizer.nextToken());
            double b = Double.parseDouble(tokenizer.nextToken());
            double c = Double.parseDouble(tokenizer.nextToken());
            if (a==0 && b==0 && c==0){
                break;
            }
            bw.write(isPita(a, b, c)?"right":"wrong");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
