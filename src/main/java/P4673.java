import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4673 {
    public static List d(int n) {
        boolean arr[] = new boolean[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i] = false;
        }
        for (int i = 1; i < n; i++){
            int constructor = i;
            while(constructor <= n){
                int rest = constructor;
                while(rest > 0){
                    int digit = rest % 10;
                    rest /= 10;
                    constructor += digit;
                }
                if(constructor <= n)
                    arr[constructor] = true;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(arr[i] == false){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        List<Integer> result = d(10000);
        for(Integer i: result){
            sb.append(i.toString());
            sb.append("\n");
        }
        System.out.print(sb.toString());
        return;
    }
}
