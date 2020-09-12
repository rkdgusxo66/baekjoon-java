import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class P5622 {
    public static int calculateDuration(String s) {
        Map<Character, Integer> dialMap = new HashMap();
        dialMap.put('A', 2);
        dialMap.put('B', 2);
        dialMap.put('C', 2);
        dialMap.put('D', 3);
        dialMap.put('E', 3);
        dialMap.put('F', 3);
        dialMap.put('G', 4);
        dialMap.put('H', 4);
        dialMap.put('I', 4);
        dialMap.put('J', 5);
        dialMap.put('K', 5);
        dialMap.put('L', 5);
        dialMap.put('M', 6);
        dialMap.put('N', 6);
        dialMap.put('O', 6);
        dialMap.put('P', 7);
        dialMap.put('Q', 7);
        dialMap.put('R', 7);
        dialMap.put('S', 7);
        dialMap.put('T', 8);
        dialMap.put('U', 8);
        dialMap.put('V', 8);
        dialMap.put('W', 9);
        dialMap.put('X', 9);
        dialMap.put('Y', 9);
        dialMap.put('Z', 9);
        int totalTime = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = dialMap.get(s.charAt(i));
            totalTime += num + 1;
        }
        return totalTime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(calculateDuration(br.readLine())));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}