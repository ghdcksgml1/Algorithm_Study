// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 14268 KB , 시간 : 136 ms

import java.util.*;
import java.io.*;

public class Main {
    public static int[] dp = new int[1001];
    public static int dynamic(int x){
        if(x == 1) return 0;
        if(x == 2) return 1;
        if(x == 3) return 0;
        if(dp[x] != 0) return dp[x];
        return dp[x] = dynamic(x-2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = dynamic(N);
        if(result == 0){
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }
    }
}
