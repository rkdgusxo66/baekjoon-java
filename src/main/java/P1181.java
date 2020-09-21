import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length() || (o1.length() == o2.length() && o1.compareTo(o2) > 0)){
            return 1;
        }else if(o1.length() == o2.length() && o1.compareTo(o2) == 0){
            return 0;
        }
        return -1;
    }
}

public class P1181 {
    public static <T> void swap(T[] a, int i, int j){
        T tmp = a[i]; a[i]=a[j]; a[j]=tmp;
    }
    public static <T> T[] qsortWithOverlap(T[] a, int l, int r, Comparator<T> comparator) {
        int lo, lt, gt, hi, i;
        T pivot;
        lo = l; hi = r; lt = lo; gt = hi;
        i = lo;
        if(l >= r){
            return a;
        }
        pivot = a[lo];
        while (i <= gt){
            int cmp = comparator.compare(a[i], pivot);
            if(cmp < 0){
                swap(a, i++, lt++);
            }else if(cmp > 0){
                swap(a, i, gt--);
            }else{
                i++;
            }
        }
        qsortWithOverlap(a, lo, lt-1, comparator);
        qsortWithOverlap(a, gt+1, hi, comparator);
        return a;
    }

    public static String[] sortUniqueWithComparator(String[] input) {
        MyComparator comparator = new MyComparator();
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList(input));
        input = set.toArray(new String[0]);
        qsortWithOverlap(input, 0, input.length-1, comparator);
        return input;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input[] = new String[n];
        for(int i=0;i<n; i++){
            input[i] = br.readLine();
        }
        String output[] = sortUniqueWithComparator(input);
        for(String s: output){
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
