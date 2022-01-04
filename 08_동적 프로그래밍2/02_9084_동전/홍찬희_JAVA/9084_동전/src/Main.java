// 언어 : JAVA , (성공/실패) : 1/3 , 메모리 : 14936 KB , 시간 : 148 ms

import java.util.*;
import java.io.*;

public class Main {
    public static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int M = Integer.parseInt(br.readLine());
            dp = new int[M+1];
            dp[0] = 1;

            int temp;
            for(int i=0;i<N;i++){
                for(int j=0;j<=M;j++){
                    temp = arr[i]+j;
                    if(temp > M) continue;
                    if(dp[j] != 0){
                        dp[temp] += dp[j];
                    }
                }
            }
            bw.write(dp[M]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
