import java.util.Scanner;

public class P10950 {
    public static int onePlusOne(int a, int b) {
        return a + b;
    }

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while(i > 0){
            int a = scanner.nextInt();
            int b= scanner.nextInt();
            System.out.println(onePlusOne(a, b));
            --i;
        }
        return;
    }
}
