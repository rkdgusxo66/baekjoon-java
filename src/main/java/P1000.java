import java.util.Scanner;

public class P1000 {
    public static int sum(int x, int y) {
        return x+y;
    }

    public static void main(String... argv) {
        Scanner sc = new Scanner(System.in);
        int sum = sum(sc.nextInt(), sc.nextInt());
        System.out.println(sum);
    }
}
