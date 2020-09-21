import java.io.*;
import java.util.Comparator;
import java.util.StringTokenizer;

class Member implements Comparable<Member> {
    private String name;
    private int age;
    private int register;

    public static Member of(String name, int age, int register){
        Member m = new Member();
        m.setName(name);
        m.setAge(age);
        m.setRegister(register);
        return m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    @Override
    public int compareTo(Member m) {
        if(this.getAge() > m.getAge() || (this.getAge() == m.getAge() && this.getRegister() > m.getRegister())){
            return 1;
        } else if(this.getAge() == m.getAge()
                && this.getRegister() == m.getRegister()
                && this.getName() == m.getName()){
            return 0;
        }
        return -1;
    }
}
public class P10814 {
    public static <T> void swap(T[] arr, int i, int j){
        T tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }
    public static <T extends Comparable<T>> void qsort(T[] input, int l, int r){
        int left, right;
        T pivot;
        if(l >= r){
            return;
        }
        left = l; right = r;
        pivot = input[(l+r)/2];
        while (left < right){
            while (input[left].compareTo(pivot)<0) left++;
            while (left < right && input[right].compareTo(pivot) > 0) right--;
            if(left < right){
                swap(input, left, right);
            }
        }
        qsort(input, l, right-1);
        qsort(input,right+1, r);
    }
    public static Member[] sortMemeber(Member[] input) {
        qsort(input, 0, input.length-1);
        return input;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Member input[] = new Member[n];
        for(int i=0;i<n;i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(tokenizer.nextToken());
            String name = tokenizer.nextToken();
            input[i] = Member.of(name, age, i);
        }
        sortMemeber(input);
        for(Member m: input){
            bw.write(m.getAge() + " " + m.getName());
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
