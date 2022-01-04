// 언어 : JAVA , (성공/실패) : 2/4
// 메모리 : 14684 KB , 시간 : 156 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[31][31];

    public static int comb(int n, int r) {

        // 이 코드 없으면 시간 초과
        // 이미 계산한 dp는 바로 return
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write(comb(M, N)+"\n");
        }
        bw.close();
    }
}