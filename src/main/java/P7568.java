import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

class Body implements Comparable<Body> {
    int height;
    int weight;

    public static Body of(int weight, int height) {
        Body newBody = new Body();
        newBody.setHeight(height);
        newBody.setWeight(weight);
        return newBody;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Body o) {
        if (this.getHeight() > o.getHeight() && this.getWeight() > o.getWeight()) {
            return 1;
        }
        return 0;
    }
}

public class P7568 {
    public static ArrayList<Integer> getBodyRanks(ArrayList<Body> bodies) {
        ArrayList<Integer> bodyRank = new ArrayList();
        for (int i = 0; i < bodies.size(); i++) {
            int rank = 1;
            Body currentBody = bodies.get(i);
            for (int j = 0; j < bodies.size(); j++) {
                if (bodies.get(j).compareTo(currentBody) > 0){
                    ++rank;
                }
            }
            bodyRank.add(rank);
        }
        return bodyRank;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Body> bodies = new ArrayList<>(n);
        while (n > 0){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            bodies.add(Body.of(x, y));
            --n;
        }
        ArrayList<Integer> result = getBodyRanks(bodies);
        String resultStr = result.stream().map(String::valueOf).collect(Collectors.joining(" "));
        bw.write(resultStr);
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
