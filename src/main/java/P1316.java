import java.io.*;

public class P1316 {
    public static boolean isGroupWord(String s) {
        boolean existAlphabet[] = new boolean['z' - 'a' + 1];
        char prevChar = s.charAt(0);
        for (int i = 0; i < existAlphabet.length; i++) {
            existAlphabet[i] = false;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (existAlphabet[currentChar - 'a'] && prevChar != currentChar) {
                return false;
            }
            existAlphabet[currentChar - 'a'] = true;
            prevChar = currentChar;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            if(isGroupWord(br.readLine())){
                ++sum;
            }
            --n;
        }
        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
