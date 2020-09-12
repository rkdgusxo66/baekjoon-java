import java.io.*;
import java.util.HashSet;

public class P2941 {
    static HashSet croaticWord = new HashSet() {{
        add("c=");
        add("c-");
        add("dz=");
        add("d-");
        add("lj");
        add("nj");
        add("s=");
        add("z=");
    }};

    public static int getCroaticWordCount(String s) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            sb.setLength(0);
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if (croaticWord.contains(sb.toString())) {
                    i = j;
                    break;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getCroaticWordCount(br.readLine())));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
