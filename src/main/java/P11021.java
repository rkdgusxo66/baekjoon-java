import java.io.*;

public class P11021 {
    public static int getAnswer(int a, int b) {
        return a+b;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i <= n; i++){
            String op[] = br.readLine().split(" ");
            int a = Integer.parseInt(op[0]);
            int b = Integer.parseInt(op[1]);
            sb.append("Case #")
                    .append(i)
                    .append(": ")
                    .append(getAnswer(a, b))
                    .append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        return;
    }
}
