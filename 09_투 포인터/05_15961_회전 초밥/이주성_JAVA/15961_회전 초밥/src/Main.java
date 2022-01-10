// 언어 : JAVA , (성공/실패) : 1/0
// 메모리 : 171152 KB , 시간 : 612 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N, d, k, c, sushi[], visit[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        sushi = new int[N];
        visit = new int[d + 1];
        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        bw.write(sliding_window()+" ");

        bw.close();
    }

    public static int sliding_window() {
        int eat_total = 0; // 먹은 초밥의 가짓수
        int max = 0; // 가장 많은 종류를 먹었을 때의 먹은 초밥의 가짓수

        // k만큼 먼저 먹었다 생각
        for(int i=0; i<k; i++) {
            // 안먹었던 초밥이면 가짓수 ++
            if (visit[sushi[i]]++ == 0) {
                eat_total++;
            }
        }

        max = Math.max(eat_total, max);

        // sushi[1]부터 해서 슬라이드 윈도우로 한바퀴 돌린다.
        for(int i=1; i<N; i++) {

            if(max <= eat_total) {
                // 쿠폰 초밥 안먹었으면 가짓수++
                if(visit[c] == 0) {
                    max = eat_total+1;
                }
                // 먹었으면 그대로
                else {
                    max = eat_total;
                }
            }

            // 슬라이드 윈도우 방식으로 앞에서 하나 빼주기
            visit[sushi[i-1]]--;

            // 빼줘도 먹은 기록이 있을 수 있으므로 확인하고 없으면 가짓수 빼기
            if(visit[sushi[i-1]] == 0) {
                eat_total--;
            }

            // 슬라이드 윈도우 방식으로 하나 먹기
            // 회전 초밥이니까 끝 인덱스 다음 인덱스를 처음 인덱스로 해주기 위해 %N 해주기
            if(visit[sushi[(i+k-1)%N]]++ == 0) {
                eat_total++;
            }
        }

        return max;

    }
}