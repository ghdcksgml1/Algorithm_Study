// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 50044 KB , 시간 : 852 ms

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static void Sort(int[][] arr, int N) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // y 좌표가 같으면
                if (o1[1] == o2[1]) {
                    // x 좌표 오름차순
                    return o1[0] - o2[0];
                } else {
                    // y 좌표 오름차순
                    return o1[1] - o2[1];
                }

            }
        });
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

        int[][] arr = new int[N][2];

        for (int i=0; i<N; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Sort(arr, N);

        for (int i=0; i<N; i++) {
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }

        bw.close();
    }
}
