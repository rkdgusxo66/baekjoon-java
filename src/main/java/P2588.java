import java.util.ArrayList;
import java.util.Scanner;

public class P2588 {
    public static Integer[] getAnswer(int a, int b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int c = b;
        while (c > 0) {
            int digit = c % 10;
            c /= 10;
            result.add(a*digit);
        }
        result.add(a*b);
        return result.toArray(new Integer[result.size()]);
    }

    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        Integer[] answer = getAnswer(scanner.nextInt(), scanner.nextInt());
        for (Integer val: answer){
            System.out.println(val);
        }
    }
}
