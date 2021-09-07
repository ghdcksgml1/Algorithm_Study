// 언어 : JAVA , (성공/실패) : 2/1 , 메모리 : 177836 KB , 시간 : 1748 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);
        int[] Xpoint = new int[N];

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");

        for (int i=0; i<N; i++) {
            Xpoint[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 복사
        int[] tmp = new int[N];
        for (int i=0; i<N; i++) {
            tmp[i] = Xpoint[i];
        }

        // 배열 정렬
        Arrays.sort(tmp);

        Integer[] result = new Integer[N];
        int index = 1;
        result[0] = tmp[0];

        // 베열 중복 항목 제거
        for (int i=1; i<N; i++) {
            if (result[index-1] != (tmp[i])) {
                result[index] = tmp[i];
                index++;
            }
        }

        // 좌표 압축
        int tmp_num = 0;
        for (int i=0; i<N; i++) {
            tmp_num = Arrays.binarySearch(result,0,index,Xpoint[i]);
            Xpoint[i] = tmp_num;
        }

        // 출력
        for (int i=0; i<N; i++) {
            bw.write(Xpoint[i]+" ");
        }

        bw.close();

    }
}
