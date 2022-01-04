// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 15908 KB , 시간 : 176 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] price = new int[n+1];

        for(int i=1; i<=n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[k+2];
        Arrays.fill(dp, 100001);

        dp[0] = 0;

        for(int i=1; i<=n; i++) {
            for(int j=price[i] ;j<=k; j++) {
                dp[j] = Math.min(dp[j], dp[j-price[i]]+1);
            }
        }

        if (dp[k] == 100001) {
            bw.write("-1"+" ");
        } else {
            bw.write(dp[k]+" ");
        }


        bw.close();
    }
}