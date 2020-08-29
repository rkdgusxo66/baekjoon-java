import java.util.Scanner;

public class P10998 {
    public static int mul(int a, int b){
        return a*b;
    }

    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        int result = mul(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
        return;
    }
}
