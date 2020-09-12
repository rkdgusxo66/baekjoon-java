import java.io.*;

public class P1157 {
    public static char getMostUsedAlpha(String s) {
        int usedAlpha[] = new int['Z' - 'A' + 1];
        int maxUsed = Integer.MIN_VALUE;
        char maxAlpha = '?';
        for (int i = 0; i < usedAlpha.length; i++) {
            usedAlpha[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c += 'A' - 'a';
            }
            ++usedAlpha[c - 'A'];
            if (usedAlpha[c - 'A'] > maxUsed) {
                maxUsed = usedAlpha[c - 'A'];
            }
        }
        boolean maxFound = false;
        for (int i = 0; i < usedAlpha.length; i++) {
            if(usedAlpha[i] == maxUsed) {
                if(maxFound == true){
                    return '?';
                } else {
                    maxAlpha = (char)(i + 'A');
                    maxFound = true;
                }
            }
        }
        return maxAlpha;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getMostUsedAlpha(br.readLine()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
