import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P14889 {
    public static int min;
    public static int[][] s;
    public static int startTeamScore, linkTeamScore;
    public static Stack<Integer> startTeam;
    public static Stack<Integer> linkTeam;

    public static void stringToMat(String str, int n) {
        s = new int[n][n];
        StringTokenizer lineTokenizer = new StringTokenizer(str, "\n");
        for (int i = 0; i < n; i++) {
            StringTokenizer numTokenizer = new StringTokenizer(lineTokenizer.nextToken(), " ");
            for (int j = 0; j < n; j++) {
                s[i][j] = Integer.parseInt(numTokenizer.nextToken());
            }
        }
    }

    public static void backtrack(int idx) {
        int sSum;
        if (idx == s.length) {
            int diff = Math.abs(startTeamScore - linkTeamScore);
            if (diff < min) {
                min = diff;
            }
            return;
        }

        if (startTeam.size() < s.length / 2) {
            sSum = 0;
            for (int i = 0; i < startTeam.size(); i++) {
                sSum += s[startTeam.get(i)][idx] + s[idx][startTeam.get(i)];
            }
            startTeam.push(idx);
            startTeamScore += sSum;
            backtrack(idx + 1);
            startTeamScore -= sSum;
            startTeam.pop();
        }

        if(linkTeam.size() < s.length / 2) {
            sSum = 0;
            for (int i = 0; i < linkTeam.size(); i++) {
                sSum += s[linkTeam.get(i)][idx] + s[idx][linkTeam.get(i)];
            }
            linkTeam.push(idx);
            linkTeamScore += sSum;
            backtrack(idx + 1);
            linkTeamScore -= sSum;
            linkTeam.pop();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i=0; i <n; i++){
            sb.append(br.readLine());
            if (i != n-1){
                sb.append("\n");
            }
        }
        stringToMat(sb.toString(), n);
        min = Integer.MAX_VALUE;
        startTeamScore=0; linkTeamScore=0;
        startTeam = new Stack<Integer>();
        linkTeam = new Stack<Integer>();
        backtrack(0);
        bw.write(String.valueOf(min));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
