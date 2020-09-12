import java.io.*;

public class P11654 {
    public static int getAsciiCode(char a) {
        return (int)a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char c = (char)br.read();
        bw.write(String.valueOf(getAsciiCode(c)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
