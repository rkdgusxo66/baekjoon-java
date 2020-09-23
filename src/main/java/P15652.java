import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P15652 {
    static boolean visited[] = new boolean[10];
    static ArrayList<Integer> history = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> results = new ArrayList<>();

    public static boolean isPromising(int n) {
        for(int i=n+1; i <= 9; i++){
            if(visited[i]){
                return false;
            }

        }
        return true;
    }

    public static ArrayList<ArrayList<Integer>> backtrack(int n, int m) {
        if (m == 0){
            results.add(new ArrayList<>(history));
            return results;
        }
        for(int i=1; i<=n; i++){
            if(!isPromising(i)){
                continue;
            }
            visited[i] = true;
            history.add(i);
            backtrack(n, m-1);
            history.remove(history.size()-1);
            visited[i] = false;
        }
        return results;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer =new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        backtrack(n, m);
        for(ArrayList<Integer> line: results){
            bw.write(line.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
