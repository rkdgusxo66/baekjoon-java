import java.util.Scanner;

public class P10869 {

    public static int add(int x, int y) {
        return x+y;
    }

    public static int sub(int x, int y) {
        return x-y;
    }

    public static int mult(int x, int y) {
        return x*y;
    }

    public static int div(int x, int y) {
        return x/y;
    }

    public static int mod(int x, int y) {
        return x%y;
    }

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mult(a,b));
        System.out.println(div(a,b));
        System.out.println(mod(a,b));
    }
}
