// 언어 : JAVA , (성공/실패) : 1/0
// 메모리 : 115980 KB , 시간 : 840 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] dp = new int[N+1][M+1];

        for (int x = 1; x <= N; x++) {
            st  = new StringTokenizer(br.readLine());
            for (int y = 1; y <= M; y++) {
                int input = Integer.parseInt(st.nextToken());
                dp[x][y] = dp[x - 1][y] + dp[x][y - 1] + input - dp[x - 1][y - 1];
            }
        }

        int K = Integer.parseInt(br.readLine());

        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1];

            bw.write( result + "\n");
        }

        bw.close();
    }
}