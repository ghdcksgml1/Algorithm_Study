// 언어 : JAVA , (성공/실패) : 1/0
// 메모리 : 43756 KB , 시간 : 480 ms

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] map;


    static int[] dx;
    static int[] dy;

    static boolean[][] visited;

    static Queue<Pair> q;

    static int cnt = 0;
    static int area = 0;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        visited = new boolean[n][m];

        q = new LinkedList<>();

        // n x m map 채우기
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2중 for문으로 방문하지 않는 1값 찾아서 BFS
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == 0 || visited[i][j] == true) {
                    continue;
                }

                BFS(i, j);
            }
        }

        bw.write(cnt+"\n"+max);

        bw.close();
    }

    public static class Pair {
        int x,y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void BFS(int i, int j) {


        cnt++; // 개수++
        q.offer(new Pair(i, j)); // 큐에 추가
        visited[i][j] = true; // 방문 처리
        area = 0; // 영역 넓이 초기화

        while(!q.isEmpty()) { // 큐가 빌때까지
            Pair p = q.poll(); // 하나 뽑아서
            area++; // 큐에서 하나 뽑을 때마다 영역++

            // 상하좌우 살피기
            for(int k=0; k<4; k++) {
                // 이동한 x, y 좌표
                int n_x = p.x + dx[k];
                int n_y = p.y + dy[k];

                // map 범위를 벗어나면 continue
                if(n_x<0 || n_x>=n || n_y<0 || n_y>=m) {
                    continue;
                }

                // 이동한 좌표의 값이 1이고 방문기록이 없을 경우
                if (map[n_x][n_y] == 1 && !visited[n_x][n_y]) {
                    // 큐에 추가하고
                    q.offer(new Pair(n_x, n_y));
                    // 방문 처리
                    visited[n_x][n_y] = true;
                }
            }
        }
        max = Math.max(area, max);
    }
}