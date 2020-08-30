import java.util.Scanner;

public class P9498 {

    public static String calculateGrade(int score) {
        if(score >= 90 && score <= 100){
            return "A";
        } else if(score >= 80 && score <= 89){
            return "B";
        } else if(score >= 70 && score <= 79){
            return "C";
        } else if(score >= 60 && score <= 69){
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(calculateGrade(score));
        return;
    }
}
