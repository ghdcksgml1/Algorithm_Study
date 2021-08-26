// 언어 : JAVA , (성공/실패) : 1/3 , 메모리 : 14360 KB , 시간 : 132 ms

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();
        String[] str = s.split("");

        // 내림차순 정렬
        Arrays.sort(str, Collections.reverseOrder());

//        int[] arr = new int[str.length];
//        for (int i=0; i<str.length; i++) {
//            arr[i] = Integer.parseInt(str[i]);
//        }

        for (int i=0; i<str.length; i++) {
            if (str[i] != "0") {
                bw.write(str[i]);
            }

        }

        bw.close();

    }
}
