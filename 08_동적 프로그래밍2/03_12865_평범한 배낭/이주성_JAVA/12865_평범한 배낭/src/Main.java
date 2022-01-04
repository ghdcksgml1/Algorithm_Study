// 언어 : JAVA , (성공/실패) : 1/0
// 메모리 : 54200 KB , 시간 : 212 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 물건 리스트
        int[][] items = new int[N+1][2];
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            items[i][0] = Integer.parseInt(st.nextToken());
            items[i][1] = Integer.parseInt(st.nextToken());
        }


        int max = 0;

        // dp 테이블의 0번째 줄을 위해 다음과 같이 정의해준다.
        // dp[0][0~K+1]와 dp[0~N+1][0] 즉, 위와 왼쪽 한줄 다 0으로 초기화
        int[][] dp = new int[N+1][K+1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=K; j++) {
                // 물건을 넣을 수 없는 경우
                if(j < items[i][0]) {
                    dp[i][j] = dp[i-1][j];
                }

                // 물건을 넣을 수 있는 경우
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-items[i][0]] + items[i][1]);
                }
            }
        }

        bw.write(dp[N][K]+" ");
        bw.close();
    }
}