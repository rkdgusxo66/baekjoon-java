import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427 {
    public static String sortString(String s) {
        int countMap[] = new int[10];
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            ++countMap[Integer.parseInt(String.valueOf(c))];
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < countMap[i]; j++) {
                sb.append(String.valueOf(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        System.out.println(sortString(inputString));
        br.close();
        return;
    }
}
