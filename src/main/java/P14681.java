import java.util.Scanner;

public class P14681 {
    public static int convertToQuaddrant(int x, int y) {
        if(x > 0){
            if(y > 0)
                return 1;
            else
                return 4;
        } else {
            if(y > 0)
                return 2;
            else
                return 3;

        }
    }

    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int quadrant = convertToQuaddrant(x, y);
        System.out.println(quadrant);
        return;
    }
}
