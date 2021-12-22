// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 18652 KB , 시간 : 396 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int student = Integer.parseInt(st.nextToken());
        int max_block = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        // 각 학생들의 블럭 정보
        int block[][] = new int[student+1][H];

        // dp
        int dp[][] = new int[student+1][H+1];

        // 각 학생들의 보유 블럭 정보 담기
        for(int i=1; i<=student; i++) {
            dp[i-1][0] = 1;

            st = new StringTokenizer(br.readLine()," ");
            int block_num = st.countTokens();
            for(int j=0; j<block_num; j++) {
                block[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i=0; i<student; i++) {
            for(int j=0; j<max_block; j++) {
                int now = block[i+1][j];
                if (now > 0) {
                    for(int h=now; h<=H; h++) {
                        dp[i+1][h] = dp[i+1][h] + dp[i][h-now];
                    }
                }
            }

            for(int k=1; k<=H; k++) {
                dp[i+1][k] += dp[i][k];
                dp[i+1][k] %= 10007;
            }
        }


//        for(int x=0; x<=student; x++) {
//            for(int y=0; y<=H; y++) {
//                bw.write(dp[x][y]+" ");
//            }
//            bw.write("\n");
//        }

        bw.write(dp[student][H]+" ");
        bw.close();
    }
}