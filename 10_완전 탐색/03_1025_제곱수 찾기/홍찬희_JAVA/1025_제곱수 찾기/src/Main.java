// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 14296 KB , 시간 : 136 ms
import java.util.*;
import java.io.*;

public class Main {
    // 완전제곱수 판별
    public static boolean isSqrt(int x){
        int result = Double.compare((int)Math.sqrt(x),Math.sqrt(x));
        if(result == 0) return true;
        else return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        // 입력값 받기
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        int max = -1; // 값 갱신이 없을경우 -1을 출력해야하므로

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                // (i,j) 기준으로 모든 등차수열을 구하기위해
                // [-N,N) , [-M,M) 범위를 탐색
                for(int ki=-N;ki<N;ki++){
                    for(int kj=-M;kj<M;kj++){
                        // ki, kj 둘다 0인 경우에는 자기 자신을 한번 더 추가하게되므로
                        // 이 조건은 넘긴다.
                        if(ki == 0 && kj == 0) continue;

                        int row = i;
                        int col = j;
                        int temp = 0;

                        while(row >= 0 && row < N && 0<=col && col < M){
                            // 현재 값의 맨뒤에 등차수열로 이동했을때의 값을 더해준다.
                            // ex.) 221 , 1 => 2211
                            // ex.) 2321 , 5 => 23215
                            temp = temp*10 + arr[row][col];
                            // 완전제곱수이면 값을 갱신
                            if(isSqrt(temp)) max = Math.max(max,temp);

                            row += ki;
                            col += kj;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}