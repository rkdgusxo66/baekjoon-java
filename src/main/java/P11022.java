import java.io.*;

public class P11022 {
    public static int getAnswer(int a, int b) {
        return a+b;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            String nums[] = br.readLine().split(" ");
            sb.append("Case #")
                    .append(i)
                    .append(": ")
                    .append(nums[0])
                    .append(" + ")
                    .append(nums[1])
                    .append(" = ")
                    .append(getAnswer(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])))
                    .append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        return;
    }
}
