// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 16008 KB , 시간 : 160 ms

import java.util.*;
import java.io.*;

public class Main {
    public static int[][] dp = new int[30][30];
    // mCn의 조합구현
    public static int Dynamic(int n,int m){
        if(n == m || n == 0){
            return 1;
        }
        if(n == 1){
            return m;
        }
        if(dp[n][m] != 0){
            return dp[n][m];
        }
        return dp[n][m] = Dynamic(n-1,m-1) + Dynamic(n,m-1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());


        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            bw.write(Dynamic(n,m)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
