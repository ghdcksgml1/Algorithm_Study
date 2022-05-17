import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] time;

    static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        time = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            time[i] = Integer.parseInt(br.readLine());
        }
    }

    static void pro() throws IOException {
        // 탐색 범위가 크므로 long으로 초기화
        long L = Integer.MAX_VALUE;
        long R = Integer.MIN_VALUE;

        // L과 R을 가능한 최소, 최대값으로 범위 설정
        for (int i = 1; i <= N; i++) {
            L = Math.min(L, time[i]);
            R = Math.max(R, time[i]);
        }
        R *= M;

        long ans = 0;

        // 이분탐색
        while (L <= R) {
            long mid = (L + R) / 2;

            if (YesOrNo(mid)) {
                // 최소를 구해야 하므로 가장 먼저 나온 Yes 찾기
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        bw.write(ans+" ");
    }

    // 주어진 시간 T동안 M명이 모두 검사가 가능한가? Yes or No?
    static boolean YesOrNo(long T) {
        long cnt = 0;

        // 주어진 시간 안 검사 가능한 최대 인원 구해주기
        for (int i = 1; i <= N; i++) {
            cnt += T / time[i];
        }

        // M과 비교
        return cnt >= M;
    }

    public static void main(String[] args) throws IOException {
        init();

        pro();

        bw.close();
    }

}