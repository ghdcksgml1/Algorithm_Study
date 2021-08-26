// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 341608 KB , 시간 : 2832 ms

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

        int[] arr = new int[N];

        for (int i=0;i<N;i++) {
            s = br.readLine();
            arr[i] = Integer.parseInt(s);
        }

        // 오름차순 정렬
        Arrays.sort(arr);
        Arrays.toString(arr);

        for (int i=0;i<N;i++) {
            bw.write(arr[i]+"\n");
        }

//        // 내림차순 정렬
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        for (int i=0;i<N;i++) {
//            bw.write(arr[i]+"\n");
//        }

        bw.close();
    }
}
