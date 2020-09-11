import java.io.*;

public class P8958 {
    public static int calculateScore(String answer) {
        int score = 0;
        int acc = 1;
        for(int i=0;i<answer.length(); i++){
            if('O' == answer.charAt(i)){
                score += acc;
                ++acc;
            } else {
                acc = 1;
            }
        }
        return score;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 0){
            bw.write(String.valueOf(calculateScore(br.readLine())));
            bw.newLine();
            --n;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
