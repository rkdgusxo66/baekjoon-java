import java.io.*;

public class P2751 {
    public static void qsort(int[] input, int i, int j) {
        int left, right, pivot, tmp;
        left = i; right = j;
        pivot = input[(i + j) /2];
        if(left >= right){
            return;
        }
        while (left < right){
            while (input[right] > pivot) right--;
            while (left < right && input[left] < pivot) left++;
            tmp = input[right];
            input[right] = input[left];
            input[left] = tmp;
        }
        qsort(input, i, right-1);
        qsort(input, right+1, j);
        return;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n, input[];
        n = Integer.parseInt(br.readLine());
        input = new int[n];
        for (int i=0; i< n; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        qsort(input,0, input.length-1);
        for (int i=0; i<n; i++){
            bw.write(String.valueOf(input[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
