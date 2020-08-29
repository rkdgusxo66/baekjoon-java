import java.util.Scanner;

public class P10430 {
    public static int func1(int a, int b, int c) {
        return (a+b)%c;
    }

    public static int func2(int a, int b, int c) {
        return ((a%c)+(b%c))%c;
    }

    public static int func3(int a, int b, int c) {
        return (a*b)%c;
    }

    public static int func4(int a, int b, int c) {
        return ((a%c)*(b%c))%c;
    }
    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(func1(a,b,c));
        System.out.println(func2(a,b,c));
        System.out.println(func3(a,b,c));
        System.out.println(func4(a,b,c));
    }
}
