// 언어 : JAVA, 성공/실패 : 1/0, 메모리 : 18800KB, 시간 : 212ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];

        rec_func(1, 1);

        bw.close();
    }

    private static void rec_func(int k, int prev) throws IOException {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                bw.write(selected[i]+" ");
            }
            bw.write("\n");
        } else {
            for (int i = prev; i <= N; i++) {
                selected[k] = i;
                rec_func(k + 1, i);
                selected[k] = 0;
            }
        }

    }


}
