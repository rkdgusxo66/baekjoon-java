import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P11729 {
    public static List<String> getHanoiProcess(int n, int from, int to) {
        ArrayList<String> result = new ArrayList();
        int empty = 6 - from - to;
        if (n == 1){
            result.add(from + " " + to);
            return result;
        }
        result.addAll(getHanoiProcess(n-1, from, empty));
        result.add(from + " " + to);
        result.addAll(getHanoiProcess(n-1, empty, to));
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<String> result = getHanoiProcess(n, 1, 3);
        bw.write(String.valueOf(result.size()));
        bw.newLine();
        for(String line: result){
            bw.write(line);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
