// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 16304 KB , 시간 : 152 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] jumps;
    static int N, K;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        // 점프 index 1, 2단점프 index 2
        jumps = new int[N][2];

        for(int i=1; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            jumps[i][0] = Integer.parseInt(st.nextToken());
            jumps[i][1] = Integer.parseInt(st.nextToken());
        }

        K = Integer.parseInt(br.readLine());

        go(1,0, false);

        bw.write(answer+" ");

        bw.close();
    }

    public static void go(int stone_num, int sum, boolean super_jump) {
        // n번째 돌에 오면 최소 값 체크 후 종료
        if (stone_num == N) {
            answer = Math.min(answer, sum);
            return;
        }

        // n번째 돌을 넘어가면 종료
        if (stone_num > N) return;

        // 1단 점프
        if (stone_num+1 <= N) {
            go(stone_num + 1, sum + jumps[stone_num][0], super_jump);

        }

        // 2단 점프
        if (stone_num+2 <= N) {
            go(stone_num + 2, sum + jumps[stone_num][1], super_jump);

        }

        // 3단 점프를 사용하지 않았을 경우
        if (!super_jump && stone_num+3 <=N) {
            go(stone_num + 3, sum + K, true);
        }
    }
}