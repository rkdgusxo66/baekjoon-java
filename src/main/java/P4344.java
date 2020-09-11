import java.io.*;
import java.util.Arrays;

public class P4344 {
    public static double calculatePercentOfOverAverage(int[] scores) {
        double average = 0;
        double averageOfOverAverage = 0;
        for(int i=0; i<scores.length; i++){
            average += (double)scores[i];
        }
        average /= scores.length;
        for(int i=0; i<scores.length; i++){
            if(scores[i] > average){
                ++averageOfOverAverage;
            }
        }
        averageOfOverAverage /= scores.length;
        return averageOfOverAverage * 100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 0){
            String scoresStr[] = br.readLine().split(" ");
            scoresStr = Arrays.copyOfRange(scoresStr, 1, scoresStr.length);
            int scores[] = Arrays.stream(scoresStr).mapToInt(Integer::parseInt).toArray();
            double percent = calculatePercentOfOverAverage(scores);
            bw.write(String.format("%.3f%%", percent));
            bw.newLine();
            --n;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
