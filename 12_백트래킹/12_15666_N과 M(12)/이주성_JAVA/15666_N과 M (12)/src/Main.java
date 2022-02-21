// 언어 : JAVA , (성공/실패) : 1/0 ,
// 메모리 : 19184 KB , 시간 : 240 ms

import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M, sum;
    static int[] selected, num;
    static LinkedHashSet<String> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];
        num = new int[N + 1];
        result = new LinkedHashSet<String>();
        String numString = "";

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        rec_func(1, 1, numString);

        Iterator<String> iterator = result.iterator();
        while (iterator.hasNext()) {
            bw.write(iterator.next());
            bw.write("\n");
        }

        bw.close();
    }

    private static void rec_func(int k, int prev, String numString) throws IOException {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                result.add(numString);
            }

        } else {
            for (int i = prev; i <= N; i++) {
                int n = num[i];

                selected[k] = n;

                rec_func(k + 1, i, numString + n + " ");

                selected[k] = 0;
            }
        }
    }
}
