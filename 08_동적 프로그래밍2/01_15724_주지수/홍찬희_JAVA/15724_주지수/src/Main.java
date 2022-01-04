// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 118140 KB , 시간 : 1296 ms

import java.util.*;
import java.io.*;

public class Main {
    public static int[][] arr;
    public static int[][] dp = new int[1025][1025];
    public static int dp(int x,int y){
        if(y == 1 ) return dp[x][y] = arr[x][y];
        if(dp[x][y] != 0) return dp[x][y];
        return dp[x][y] = dp(x,y-1) + arr[x][y];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][M+1];

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1;j<=M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                dp(i,j);
            }
        }

        int K = Integer.parseInt(br.readLine());
        int[] K_arr = new int[4];
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<4;j++){
                K_arr[j] = Integer.parseInt(st.nextToken());
            }
            // dp 구현
            int sum = 0;
            for(int j=K_arr[0];j<=K_arr[2];j++){
                sum += dp[j][K_arr[3]];
                sum -= dp[j][K_arr[1]-1];
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
