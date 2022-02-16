// 언어 : JAVA , (성공/실패) : 1/0 ,
// 메모리 : 15848 KB , 시간 : 140 ms


import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] selected, visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // M개 고를건데 편의상 1부터 할거라서 M+1로 잡아둠
        selected = new int[M + 1];

        // 1~N개의 자연수 방문처리
        visit = new int[N + 1];

        // 중복조합 구하는 재귀 호출
        rec_func(1, 1);

        bw.close();
    }

    private static void rec_func(int k, int prev) throws IOException {
        // 한 케이스에 대해서 M개 다 골랐으면
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                bw.write(selected[i] + " ");
            }
            bw.write("\n");
        } else {
            for (int i = prev; i <= N; i++) {
                if(visit[i] == 1) continue;

                // 선택 후 방문처리
                selected[k] = i;
                visit[i] = 1;

                // 완전탐색
                rec_func(k + 1, i);

                // 초기화
                selected[k] = 0;
                visit[i] = 0;

            }
        }
    }


}
