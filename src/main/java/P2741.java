import java.util.Scanner;

public class P2741 {
    public static String getAnswer(int n) {
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<=n; i++){
            sb.append(i+"\n");
        }
        return sb.toString();
    }

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(getAnswer(n));
        return;
    }
}
