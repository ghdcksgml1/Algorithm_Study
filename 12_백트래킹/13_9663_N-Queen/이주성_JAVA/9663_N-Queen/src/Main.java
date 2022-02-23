import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, ans;
    static int[] col;

    public static void main(String[] args) throws IOException {
        input();

        rec_func(1);

        bw.write(ans + " ");

        bw.close();
    }

    static boolean attackable(int r1, int c1, int r2, int c2) {
        // 수직(열) 체크
        if(c1 == c2) return true;

        // 대각선 체크
        if (Math.abs(r1-r2) == Math.abs(c1-c2)) {
            return true;
        }
        return false;
    }

    static boolean validity_check() {
        for (int i = 1; i <= N; i++) {
            // i번째 행의 퀸 좌표 : (i, col[i])
            for (int j = 1; j < i; j++) {
                // j번째 행의 퀸 좌표 : (j, col[j])
                if (attackable(i, col[i], j, col[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    static void rec_func(int row) {
        // 모든 행에 퀸이 잘 배치된 경우
        if (row == N + 1) {
            ans++;
        } else {
            for (int c = 1; c <= N; c++) {
                boolean possible = true;

                // valid check (row, c)
                for (int i = 1; i <= row - 1; i++) {
                    // (i, cop[i]
                    if (attackable(row, c, i, col[i])) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    col[row] = c;
                    rec_func(row + 1);
                    col[row] = 0;
                }
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        col = new int[N + 1];
    }
}