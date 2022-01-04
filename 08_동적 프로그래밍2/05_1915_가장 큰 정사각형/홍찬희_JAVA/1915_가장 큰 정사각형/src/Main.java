// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 27116 KB , 시간 : 352 ms
import java.util.*;
import java.io.*;

// https://suriisurii.tistory.com/13
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] rect = new int[n][m];
        int[][] dp = new int[n][m];

        int answer = 0;

        // 입력값 받기
        for(int i=0;i<n;i++){
            String input = br.readLine();
            for(int j=0;j<m;j++){
                rect[i][j] = input.charAt(j) - '0';
                if(rect[i][j]==1){
                    dp[i][j] = 1;
                    answer = 1;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(rect[i][j]==1 && rect[i-1][j]==1 && rect[i][j-1]==1 && rect[i-1][j-1]==1){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]);
                    dp[i][j] = Math.min(dp[i][j],dp[i-1][j-1]) + 1;
                }
                answer = Math.max(answer,dp[i][j]);
            }
        }

        System.out.println(answer*answer);
    }
}
