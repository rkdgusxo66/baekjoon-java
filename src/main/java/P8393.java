import java.util.Scanner;

public class P8393 {
    public static int sumOneTo(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOneTo(n));
        return;
    }
}
