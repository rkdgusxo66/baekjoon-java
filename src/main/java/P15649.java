import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P15649 {
    public static void backtrack(ArrayList<ArrayList<Integer>> results, int n, int count, boolean visited[], ArrayList<Integer> history){
        if (count==0){
            ArrayList<Integer> result = new ArrayList<>();
            result.addAll(history);
            results.add(result);
            return;
        }
        for(int i=1; i<=n; i++){
            if (visited[i]){
                continue;
            }
            visited[i] = true;
            history.add(i);
            backtrack(results, n, count-1, visited, history);
            history.remove(history.size()-1);
            visited[i] = false;
        }

    }
    public static ArrayList<ArrayList<Integer>> getAnswer(int n, int m) {
        boolean visited[] = new boolean[9];
        Arrays.fill(visited, false);
        ArrayList<Integer> history = new ArrayList<>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        backtrack(results, n, m, visited, history);
        return results;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        ArrayList<ArrayList<Integer>> answers = getAnswer(n, m);
        for (ArrayList<Integer> answer: answers){
            bw.write(answer.stream().map(String::valueOf).collect(Collectors.joining(" ")));
            bw.newLine();
        }
        bw.close();
        br.close();
        return;
    }
}
