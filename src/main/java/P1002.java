import java.io.*;
import java.util.StringTokenizer;

public class P1002 {
    public static int getPossiblePositionNum(double x1, double y1, double r1, double x2, double y2, double r2) {
        double distanceOfTwoPeople = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double sumOfEachTargetDistance = r1 + r2;
        double subOfEachTargetDistance = Math.abs(r1 - r2);

        if (distanceOfTwoPeople == 0.0) {
            if (r1 == r2) {
                return -1;
            }
            return 0;
        }

        if (subOfEachTargetDistance >= distanceOfTwoPeople) {
            if (distanceOfTwoPeople == subOfEachTargetDistance){
                return 1;
            } else {
                return 0;
            }
        } else {

            if (distanceOfTwoPeople > sumOfEachTargetDistance) {
                return 0;
            } else if (distanceOfTwoPeople < sumOfEachTargetDistance) {
                return 2;
            }
            return 1;
        }

    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            double x1 = Double.parseDouble(tokenizer.nextToken());
            double y1 = Double.parseDouble(tokenizer.nextToken());
            double r1 = Double.parseDouble(tokenizer.nextToken());
            double x2 = Double.parseDouble(tokenizer.nextToken());
            double y2 = Double.parseDouble(tokenizer.nextToken());
            double r2 = Double.parseDouble(tokenizer.nextToken());
            int i = getPossiblePositionNum(x1, y1, r1, x2, y2, r2);
            bw.write(String.valueOf(i));
            bw.newLine();
            --n;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
