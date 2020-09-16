import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1978 {
    public static int getPrimeNumberCount(List<Integer> list) {
        int count = 0;
        for(int num: list){
            if (num == 1)
                continue;
            ++count;
            for(int i=2; i<=num/2; i++){
                if(num%i == 0){
                    --count;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList list = new ArrayList();
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        while (tokenizer.hasMoreTokens()){
            list.add(Integer.valueOf(tokenizer.nextToken()));
        }
        bw.write(String.valueOf(getPrimeNumberCount(list)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
