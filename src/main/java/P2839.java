import java.io.*;

public class P2839 {
    public static int getMinBag(int n) {
        int numFiveBags = n / 5;
        int rest = n % 5;
        int numThreeBags = rest / 3;
        rest %= 3;
        if(rest == 1){
            numFiveBags -= 1;
            numThreeBags += 2;
        } else if(rest == 2){
            numFiveBags -= 2;
            numThreeBags += 4;
        }
        if (numFiveBags < 0){
            return -1;
        }
        return numFiveBags + numThreeBags;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int minBag = getMinBag(n);
        bw.write(String.valueOf(minBag));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
