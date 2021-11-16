// 언어 : JAVA , (성공/실패) : 1/0
// 메모리 : 18652 KB , 시간 : 396 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int[][] dp = new int[31][31];

        for(int N=0; N<31; N++) {
            for(int M=1; M<31; M++) {
                if (N == 0 || N == M) dp[N][M]=1;
                else if (N == 1) dp[N][M]=M;
                else dp[N][M] = dp[N-1][M-1] + dp[N][M-1];
            }
        }

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write(dp[N][M]+"\n");
        }



        bw.close();
    }
}