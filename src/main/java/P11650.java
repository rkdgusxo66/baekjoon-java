import java.io.*;
import java.util.*;

class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;

    public static Coordinate of(int x, int y)  {
        Coordinate coordinate = new Coordinate();
        coordinate.x = x;
        coordinate.y = y;
        return coordinate;
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

    @Override
    public boolean equals(Object o) {
        Coordinate c = (Coordinate) o;
        return this.getX() == c.getX() && this.getY() == c.getY();
    }

    @Override
    public int compareTo(Coordinate c) {
        if (this.getX() > c.getX()
                || (this.getX() == c.getX() && this.getY() > c.getY())) {
            return 1;
        } else if(this.getX() == c.getX() && this.getY() == c.getY()){
            return 0;
        }
        return -1;
    }

}
class Pair{
    private int fst;
    private int snd;
    public static Pair of(int fst, int snd){
        Pair tmp = new Pair();
        tmp.fst = fst;
        tmp.snd = snd;
        return tmp;
    }

    public int getFst() {
        return fst;
    }

    public int getSnd() {
        return snd;
    }
}

public class P11650 {
    public static <T extends Comparable> List<T> sortCoordinates(List<T> a) {
        ArrayDeque<Pair> stack = new ArrayDeque<>();
        stack.push(Pair.of(0, a.size()-1));
        int lo, hi, lt, gt, i;
        T pivot, tmp;
        while (!stack.isEmpty()){
            Pair idx = stack.pop();
            lo = idx.getFst(); lt = idx.getFst();
            hi = idx.getSnd(); gt = idx.getSnd();
            i = lo;
            if (hi <= lo)
                continue;
            pivot = a.get(lo);
            while (i <= gt){
                int cmp = a.get(i).compareTo(pivot);
                if (cmp < 0){
                    tmp = a.get(lt);
                    a.set(lt, a.get(i));
                    a.set(i, tmp);
                    lt++;
                    i++;
                } else if(cmp > 0){
                    tmp = a.get(gt);
                    a.set(gt, a.get(i));
                    a.set(i, tmp);
                    gt--;
                } else {
                    i++;
                }
            }
            stack.add(Pair.of(lo, lt-1));
            stack.add(Pair.of(gt+1, hi));
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        while (n > 0) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            coordinates.add(Coordinate.of(x, y));
            --n;
        }
        sortCoordinates(coordinates);
        for (Coordinate c : coordinates) {
            bw.write(c.getX() + " " + c.getY());
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
