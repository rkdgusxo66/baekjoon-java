import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {
    public static int getNthDoomsdayNumber(int n) {
        int doomsdayCount = 0;
        for (int i=1;; i++){
            int rest = i;
            int count = 0;
            while (rest > 0){
                int digit = rest % 10;
                if (digit == 6){
                    ++count;
                } else {
                    count = 0;
                }
                if (count >= 3){
                    break;
                }
                rest /= 10;
            }
            if (count >= 3){
                ++doomsdayCount;
            }

            if(doomsdayCount == n){
                return i;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getNthDoomsdayNumber(n));
        br.close();
    }
}
