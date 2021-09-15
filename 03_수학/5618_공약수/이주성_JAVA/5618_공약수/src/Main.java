// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 18700 KB , 시간 : 1540 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int n = Integer.parseInt(N);

        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=1; i<=arr[0]; i++) {

            int cnt = 0;

            for (int j=0; j<n; j++) {
                if (arr[j] % i == 0) {
                    cnt ++;
                }
            }

            if (cnt == n) {
                bw.write(i+" ");
            }

        }


        bw.close();

    }
}
