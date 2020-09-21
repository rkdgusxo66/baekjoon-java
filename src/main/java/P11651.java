import java.io.*;
import java.util.StringTokenizer;

class Coordinate2 implements Comparable<Coordinate2> {
    private int x;
    private int y;

    public static Coordinate2 of(int x, int y) {
        Coordinate2 c = new Coordinate2();
        c.setX(x);
        c.setY(y);
        return c;
    }

    @Override
    public int compareTo(Coordinate2 c) {
        if (this.getY() > c.getY() || (this.getY() == c.getY() && this.getX() > c.getX())) {
            return 1;
        } else if (this.getY() == c.getY() && this.getX() == c.getX()) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        Coordinate2 c = (Coordinate2) o;
        if (this.getX() == c.getX() && this.getY() == c.getY()) {
            return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class P11651 {

    public static <T extends Comparable> T[] sort(T[] a, int left, int right) {
        int l, r;
        T pivot, tmp;

        if (left >= right) {
            return a;
        }
        l = left;
        r = right;
        pivot = a[(l + r) / 2];
        while (l < r) {
            while (a[l].compareTo(pivot) < 0) l++;
            while (l < r && a[r].compareTo(pivot) > 0) r--;
            if (l < r) {
                tmp = a[l];
                a[l] = a[r];
                a[r] = tmp;
            }
        }
        sort(a, left, r - 1);
        sort(a, r + 1, right);
        return a;
    }

    public static Coordinate2[] sortCoordinate(Coordinate2[] input) {
        sort(input, 0, input.length - 1);
        return input;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Coordinate2 input[] = new Coordinate2[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            input[i] = Coordinate2.of(x, y);
        }
        sortCoordinate(input);
        for(Coordinate2 c: input){
            bw.write(c.getX()+ " " + c.getY());
            bw.newLine();
        }
        bw.close();
        br.close();
        return;
    }
}
