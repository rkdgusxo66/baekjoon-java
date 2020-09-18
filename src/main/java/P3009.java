import java.io.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.StringTokenizer;

class Dot{
    private int x;
    private int y;
    public Dot(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o.getClass() != this.getClass())
            return false;

        Dot dot = (Dot)o;
        return x == dot.x &&
                y == dot.y;
    }
}
public class P3009 {
    public static Dot getFourthPoint(Dot... dots) {
        HashMap<Integer, Boolean> existX = new HashMap<>();
        HashMap<Integer, Boolean> existY = new HashMap<>();
        int x=0, y=0;
        for(Dot dot: dots){
            if(existX.getOrDefault(dot.getX(), false)){
                x -= dot.getX();
            } else{
                x += dot.getX();
            }
            existX.put(dot.getX(), true);
            if(existY.getOrDefault(dot.getY(), false)){
                y -= dot.getY();
            } else{
                y += dot.getY();
            }
            existY.put(dot.getY(), true);
        }
        return new Dot(x, y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer;
        Dot dot1, dot2, dot3;
        tokenizer = new StringTokenizer(br.readLine());
        dot1 = new Dot(Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()));
        tokenizer = new StringTokenizer(br.readLine());
        dot2 = new Dot(Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()));
        tokenizer = new StringTokenizer(br.readLine());
        dot3 = new Dot(Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()));
        Dot dot4 = getFourthPoint(dot1, dot2, dot3);
        bw.write(dot4.getX() + " " + dot4.getY());
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
