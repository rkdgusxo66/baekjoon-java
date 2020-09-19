import java.io.*;
import java.util.StringTokenizer;

public class P1018 {
    public static int getMinChessPaint(char[][] mat) {
        int rowNum = mat.length;
        int columnNum = mat[0].length;
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i <= rowNum - 8; i++) {
            for (int j = 0; j <= columnNum - 8; j++) {
                int paintNum = count8by8ChessPaintNum(mat, i, j, 'W');
                if(minCount > paintNum){
                    minCount = paintNum;
                }
                paintNum = count8by8ChessPaintNum(mat, i, j, 'B');
                if(minCount > paintNum){
                    minCount = paintNum;
                }
            }
        }
        return minCount;
    }

    public static int count8by8ChessPaintNum(char[][] input, int row, int col, char first) {
        int count = 0;
        for (int i = row; i < row+8; i++) {
            char current = first;
            if ((i+1)%2==0){
                current = (current=='W')?'B':'W';
            }
            for (int j = col; j < col+8; j++) {
                if(input[i][j] != current){
                    ++count;
                }
                current = (current=='W')?'B':'W';
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        char[][] input = new char[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                input[i][j]= (char) br.read();
            }
            br.read();
        }
        bw.write(String.valueOf(getMinChessPaint(input)));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
