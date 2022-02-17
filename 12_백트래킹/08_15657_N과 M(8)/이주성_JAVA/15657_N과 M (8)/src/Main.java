// 언어 : JAVA , (성공/실패) : 1/0 ,
// 메모리 : 163200 KB , 시간 : 764 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] selected, num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];
        num = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

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
                int n = num[i];
                selected[k] = n;

                rec_func(k + 1, i);

                selected[k] = 0;
            }
        }
    }
}
