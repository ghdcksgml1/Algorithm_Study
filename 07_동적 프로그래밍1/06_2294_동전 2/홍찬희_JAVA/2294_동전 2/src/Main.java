// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14748 KB , 시간 : 164 ms

import java.util.*;
import java.io.*;

public class Main {
    public static int[] dp = new int[100001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];

        for(int i=0;i<N;i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int temp;
        for(int i=0;i<=K;i++){
            // dp[0]이 아닌 dp[i]==0은 경우가 없는것이기때문에 배제한다.
            if(dp[i] == 0 && i!=0) continue;
            for(int j=0;j<N;j++){
                temp = i + coins[j];
                // 코인을 추가했을때 최솟값인지 아닌지 확인함
                if(dp[temp] == 0) dp[temp] = dp[i]+1;
                else{
                    dp[temp] = Math.min(dp[temp],dp[i]+1);
                }
            }
        }
        // 아래와 같이 삼항연산자로 쓰면 고수처럼 보임.
        System.out.println(dp[K]==0?-1:dp[K]);
    }
}
