import java.io.*;

public class P10809 {
    public static int[] getAlphaFirst(String s) {
        int alphabetFirst[] = new int['z' - 'a' + 1];
        for (int i = 0; i < alphabetFirst.length; i++) {
            alphabetFirst[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (alphabetFirst[idx] == -1) {
                alphabetFirst[idx] = i;
            }
        }
        return alphabetFirst;
    }

    public static void main(String... arv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result[] = getAlphaFirst(br.readLine());
        for (int i = 0; i < result.length; i++) {
            bw.append(String.valueOf(result[i]));
            if(i != result.length-1){
                bw.append(" ");
            }
        }
        bw.newLine();
        bw.flush();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
