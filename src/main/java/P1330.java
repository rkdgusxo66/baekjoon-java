import java.util.Scanner;

public class P1330 {
    public static String compare(int a, int b) {
        if(a < b){
            return "<";
        } else if(a > b){
            return ">";
        } else {
            return "==";
        }
    }

    public static void main(String... arvs){
        Scanner scanner = new Scanner(System.in);
        String result = compare(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
        return;
    }
}
