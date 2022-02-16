import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;

    // 만약 M개를 전부 고름 -> 조건에 맞는 탐색을 한 가지 성공한 것!
    // 아직 M개를 고르지 않음 -> k번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법 시도
    static void rec_func(int k) {
        if (k == M + 1) { // M개수만큼 다 고르면 등록
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {

            // 1~N 까지를 k번 원소로 한번씩 정하고,
            // 매번 k+1 번부터 M번 원소로 재귀호출 해주기
            for (int cand = 1; cand <= N; cand++) {
                selected[k] = cand;

                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];

        rec_func(1);
        System.out.println(sb.toString());
    }

}
