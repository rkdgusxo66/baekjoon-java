import java.io.*;
import java.util.Arrays;

public class P1003 {
    static int memoZero[] = new int[41];
    static int memoOne[] = new int[41];
    static int n;

    public static void countFibo(int i) {
        if (i > n){
            return;
        }
        if (i==0){
            memoZero[0]=1;
            memoOne[0]=0;
        } else if (i==1){
            memoZero[1]=0;
            memoOne[1]=1;
        } else{
            memoZero[i] = memoZero[i-1] + memoZero[i-2];
            memoOne[i] = memoOne[i-1] + memoOne[i-2];
        }
        countFibo(i+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.fill(memoZero, 0);
        Arrays.fill(memoOne, 0);
        int line = Integer.parseInt(br.readLine());
        while (line > 0){
            n = Integer.parseInt(br.readLine());
            countFibo(0);
            bw.write(memoZero[n]+" "+memoOne[n]);
            bw.newLine();
            --line;
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
