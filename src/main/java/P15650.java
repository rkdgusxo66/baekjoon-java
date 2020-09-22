import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P15650 {
    static boolean visited[] = new boolean[10];

    public static boolean isPromising(int idx) {
        for (int i = idx; i <= 9; i++) {
            if (visited[i]) {
                return false;
            }
        }
        return true;
    }

    public static void backtrack(ArrayList<ArrayList<Integer>> results, int n, int count, ArrayList<Integer> history) {
        if (count == 0) {
            results.add(new ArrayList<>(history));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!isPromising(i)) {
                continue;
            }
            visited[i] = true;
            history.add(i);
            backtrack(results, n, count - 1, history);
            history.remove(history.size() - 1);
            visited[i] = false;
        }
    }

    public static ArrayList<ArrayList<Integer>> getAnswer(int n, int m) {
        Arrays.fill(visited, false);
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        ArrayList<Integer> history = new ArrayList<>();
        backtrack(results, n, m, history);
        return results;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        ArrayList<ArrayList<Integer>> rows = getAnswer(n, m);
        for(ArrayList<Integer> row: rows){
            bw.write(String.join(" ", row.stream().map(String::valueOf).collect(Collectors.toList())));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
