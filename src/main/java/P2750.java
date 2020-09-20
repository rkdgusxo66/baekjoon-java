import java.io.*;

public class P2750 {
    public static int[] sort(int[] input) {
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length-i-1;j++){
                if(input[j] > input[j+1]){
                    int tmp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = tmp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int input[] = new int[n];
        for (int i=0; i<n; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        sort(input);
        for (int i=0; i<n ;i++){
            bw.write(String.valueOf(input[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
