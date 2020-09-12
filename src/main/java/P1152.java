import java.io.*;
public class P1152 {
    public static int getWordCount(String s) {
        String splitted[] = s.split(" ");
        int wordCount = 0;
        for(String word: splitted){
            if(!"".equals(word)){
                ++wordCount;
            }
        }
        return wordCount;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getWordCount(br.readLine())));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}