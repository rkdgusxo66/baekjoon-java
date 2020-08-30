import java.util.Scanner;

public class P2753 {
    public static int isLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return 1;
        }
        return 0;
    }

    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }
}
