// 언어 : JAVA , (성공/실패) : 1/1
// 메모리 : 14412 KB , 시간 : 144 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] dp = new String[N+1];

        for(int i=0; i<=N; i++) {
            if (i == 1) dp[i] = "SK"; //
            else if (i == 0) dp[i]="CY"; //
            else dp[i] = dp[i%2];
        }

        bw.write(dp[N]+" ");

        bw.close();
    }
}