import java.io.*;

public class P2292 {
    public static int countRooms(int n) {
        int layer = 1;
        int rooms = 1;
        while (true){
            if(n <= rooms){
                break;
            }
            ++layer;
            rooms += 6*(layer-1);
        }
        return layer;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        bw.write(String.valueOf(countRooms(n)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
