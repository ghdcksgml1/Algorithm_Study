// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14328 KB , 시간 : 132 ms

import java.util.*;
import java.io.*;

public class Main {
    public static int[] dp = new int[1001];
    public static int dp(int x){
        if(x == 1) return 1;
        if(x == 2) return 2;
        if(dp[x] != 0) return dp[x];
        return dp[x] = (dp(x-1) + dp(x-2)) % 10007;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
    }
}
