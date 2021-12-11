// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 14808 KB , 시간 : 140 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] coin = new int[N+1];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int j=1; j<=N; j++) {
                coin[j] = Integer.parseInt(st.nextToken());
            }

            int M = Integer.parseInt(br.readLine());

            int[] dp = new int[M+1];

            dp[0] = 1;

            for(int z=1; z<=N; z++) {
                for(int x=coin[z]; x<=M; x++) {
                    dp[x] += dp[x-coin[z]];
                }
            }

            bw.write(dp[M]+" ");

        }

        bw.close();
    }
}