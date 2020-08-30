import java.util.Scanner;

public class P2739 {
    public static String nineToNine(int n) {
        StringBuilder builder = new StringBuilder();
        for(int i=1; i<=9; i++){
            builder.append(String.format("%d * %d = %d\n", n, i, n*i));
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        String result = nineToNine(scanner.nextInt());
        System.out.println(result);
        return;
    }
}
