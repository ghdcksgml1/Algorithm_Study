// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 31936 KB , 시간 : 384 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int n = Integer.parseInt(N);

        int[] rope = new int[n];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            rope[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rope);
        int[] result = new int[n];

        int max_w = -1;
        for (int i=rope.length-1; i>-1; i--) {
            if(max_w < (rope[i] * (rope.length-i ))){
                max_w = (rope[i] * (rope.length-i ));
            }

        }

        bw.write(max_w+" ");


        bw.close();

    }
}