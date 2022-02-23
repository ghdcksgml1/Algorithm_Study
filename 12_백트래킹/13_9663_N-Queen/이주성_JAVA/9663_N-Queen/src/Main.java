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

    // Queen이 올 수 있는 자리인지 체크
    static boolean Q_able(int r1, int c1, int r2, int c2) {
        // 수직(열) 체크
        if(c1 == c2) return true;

        // 대각선 체크
        if (Math.abs(r1-r2) == Math.abs(c1-c2)) {
            return true;
        }
        return false;
    }

    /*
    static boolean check() {
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
    */

    static void rec_func(int row) {
        // 모든 행에 퀸이 잘 배치된 경우
        if (row == N + 1) {
            ans++;
        } else {
            for (int i = 1; i <= N; i++) {
                boolean possible = true;

                // 현재 탐색할 퀸의 위치 (row, col[row](=i))이 가능한 위치인지 확인
                // 직전의 퀸(직전의 행 row-1의 퀸)과 비교
                for (int j = 1; j <= row - 1; j++) {
                    // 직전의 퀸 (j, cop[j])
                    if (Q_able(row, i, j, col[j])) {
                        possible = false;
                        break;
                    }
                }

                // 가능한 위치인지 확인되면 거기서 또 탐색
                if (possible) {
                    col[row] = i;
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
