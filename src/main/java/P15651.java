import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P15651 {
    public static void backtrack(List<List<Integer>> results, int n, int m, List<Integer> history) {
        if (m == 0) {
            results.add(new ArrayList<>(history));
            return;
        }
        for (int i = 1; i <= n; i++) {
            history.add(i);
            backtrack(results, n, m-1, history);
            history.remove(history.size()-1);
        }
    }

    public static List<List<Integer>> getAnswer(int n, int m) {
        List<List<Integer>> results = new ArrayList<>();
        ArrayList<Integer> history = new ArrayList<>();
        backtrack(results, n, m, history);
        return results;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        List<List<Integer>> results = getAnswer(n, m);
        for (List<Integer> result: results){
            String s = result.stream().map(String::valueOf).collect(Collectors.joining(" "));
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
