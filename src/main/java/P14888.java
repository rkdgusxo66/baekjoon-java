import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P14888 {
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;
    static int plus, minus, mul, div;
    static ArrayList<Integer> numbers = new ArrayList<>();
    static int result;

    public static void backtrack(int idx){
        if(idx == numbers.size()-1){
            if (min > result){
                min = result;
            }
            if (max < result){
                max = result;
            }
            return;
        }

        int tmp = result;
        if (plus > 0){
            result += numbers.get(idx+1);
            plus--;
            backtrack(idx+1);
            plus++;
            result = tmp;
        }
        if(minus > 0){
            result -= numbers.get(idx+1);
            minus--;
            backtrack(idx+1);
            minus++;
            result = tmp;
        }
        if(mul > 0){
            result *= numbers.get(idx+1);
            mul--;
            backtrack(idx+1);
            mul++;
            result = tmp;
        }
        if(div > 0){
            result /= numbers.get(idx+1);
            div--;
            backtrack(idx+1);
            div++;
            result = tmp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        numbers = new ArrayList<>();
        while (n > 0){
            numbers.add(Integer.parseInt(tokenizer.nextToken()));
            --n;
        }
        tokenizer = new StringTokenizer(br.readLine(), " ");
        plus = Integer.parseInt(tokenizer.nextToken());
        minus = Integer.parseInt(tokenizer.nextToken());
        mul = Integer.parseInt(tokenizer.nextToken());
        div = Integer.parseInt(tokenizer.nextToken());
        result = numbers.get(0);
        backtrack(0);
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(min));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
