import java.util.Scanner;

public class P1001 {
    public static int sub(int x, int y) {
        return x-y;
    }

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        int result = sub(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
        return;
    }
}
