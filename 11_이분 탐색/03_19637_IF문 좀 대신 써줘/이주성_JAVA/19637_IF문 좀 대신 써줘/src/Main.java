import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static level[] levels;

    static class level{
        String title;
        int power;

    }

    static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        levels = new level[N + 1];

        // level 정리
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            levels[i] = new level();
            levels[i].title = st.nextToken();
            levels[i].power = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= M; i++) {
            int num = Integer.parseInt(br.readLine());

            int L = 1;
            int R = N;
            int ans = 0;

            while (L <= R) {
                int mid = (L + R) / 2;

                if (num <= levels[mid].power) {
                    ans = mid;
                    R = mid - 1;

                } else {
                    L = mid + 1;
                }
            }

            bw.write(levels[ans].title+"\n");
        }
    }

    public static void main(String[] args) throws IOException {
        init();


        bw.close();
    }

    String title;
}