import java.util.Scanner;

public class P1008 {
    public static double div(int a, int b) {
        double result = a/(double)b;
        return result;
    }

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        double result = div(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
        return;
    }
}
