import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2798 {
    public static int getOptimizedAnswerBlackjack(int n, int m, List<Integer> cards) {
        int optimizedAnswer = -1;
        for (int i=0; i<n-2; i++){
            for (int j=i+1; j<n-1; j++){
                for (int k=j+1; k<n; k++){
                    int sum = cards.get(i) + cards.get(j) + cards.get(k);
                    if (sum > m){
                        continue;
                    }
                    if(optimizedAnswer == -1){
                        optimizedAnswer = sum;
                        continue;
                    }
                    if (optimizedAnswer < sum){
                        optimizedAnswer = sum;
                    }
                }
            }
        }
        return optimizedAnswer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(br.readLine());
        ArrayList<Integer> cards = new ArrayList();
        while (tokenizer.hasMoreTokens()){
            cards.add(Integer.parseInt(tokenizer.nextToken()));
        }
        int answer = getOptimizedAnswerBlackjack(n, m, cards);
        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
