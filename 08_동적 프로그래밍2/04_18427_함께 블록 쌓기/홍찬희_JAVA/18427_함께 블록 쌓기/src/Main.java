// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14920 KB , 시간 : 156 ms

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][] top = new int[N+1][H+1]; // 탑
        int[][] block = new int[N+1][M]; // 개인이 가지고 있는 블럭
        int[] count = new int[N+1]; // 블럭의 개수

        // 예제 입력받기
        for(int t=1;t<=N;t++){
            st = new StringTokenizer(br.readLine(), " ");
            int cnt = st.countTokens(); // 토큰의 개수 세기
            count[t] = cnt; // 블럭의 개수 저장
            for(int i=0;i<cnt;i++){
                block[t][i] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<=N;i++){
            top[i][0] = 1;
        }

        // 위 문제는 두가지 케이스로 구분된다.
        // 1. 현재 블럭을 놓아야하는 사람이 블럭을 놓지 않을경우
        // 2. 현재 블럭을 놓아야하는 사람이 블럭을 놓은 경우
        for(int i=1;i<=N;i++){
            for(int j=1;j<=H;j++){
                // 블럭을 놓은 경우
                for(int k=0;k<count[i];k++){
                    int temp = j-block[i][k]; // (현재높이 - 블럭의크기)
                    if(temp >= 0){
                        top[i][j] += top[i-1][temp];
                        top[i][j] %= 10007;
                    }
                }
                // 블럭을 놓지 않은 경우
                top[i][j] += top[i-1][j];
                top[i][j] %= 10007;
            }
        }
        System.out.println(top[N][H]);
    }
}
