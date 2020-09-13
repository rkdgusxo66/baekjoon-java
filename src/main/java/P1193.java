import java.io.*;

public class P1193 {
    public static String findFraction(int x) {
        int n = x;
        int direction = 0;
        int diagonal = 1;
        int mother,son;
        while (true){
            if (n - diagonal <= 0) {
                break;
            }
            n -= diagonal;
            diagonal++;
        }
        if(diagonal % 2 == 0){
            direction = 0;
        } else {
            direction = 1;
        }
        if (direction ==0 ) {
            mother = diagonal - (n-1);
            son = 1 + (n-1);
        } else {
            mother = 1 + (n-1);
            son = diagonal - (n-1);
        }

        return son + "/" + mother;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(findFraction(n));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
