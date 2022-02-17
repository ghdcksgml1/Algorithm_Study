// 언어 : JAVA , (성공/실패) : 1/0 ,
// 메모리 : 36276 KB , 시간 : 404 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] num, selected, visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // N개의 자연수 저장
        num = new int[N + 1];

        visit = new int[10001];

        selected = new int[M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        rec_func(1);

        bw.close();
    }

    private static void rec_func(int k) throws IOException {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                bw.write(selected[i] + " ");
            }
            bw.write("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                int n = num[i];

                if(visit[n] == 1) continue;

                selected[k] = n;
                visit[n] = 1;

                rec_func(k + 1);

                selected[k] = 0;
                visit[n] = 0;
            }
        }
    }


}
