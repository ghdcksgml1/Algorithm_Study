// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 283440 KB , 시간 : 2140 ms

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N 입력
        String s = br.readLine();
        int N = Integer.parseInt(s);
        int[] Xpoint = new int[N];

        // 배열 입력
        s = br.readLine();
        String[] str = s.split(" ");
        for (int i=0; i<N; i++) {
            Xpoint[i] = Integer.parseInt(str[i]);
        }

//         배열 복사
//        int[] tmp = new int[N];
//        for (int i=0; i<N; i++) {
//            tmp[i] = Xpoint[i];
//        }

        // 배열 복사
        int[] tmp = Xpoint.clone();
        Arrays.sort(tmp);

        // 해쉬맵을 이용한 풀이
        int cnt = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<N; i++) {
            // key값에 해당되는 value가 없을 경우
            if(!hmap.containsKey(tmp[i])) {
                // key값과 value값(cnt)를 넣어준다.
                hmap.put(tmp[i], cnt++);
            }
        }

        // 출력
        for (int i=0; i<N; i++) {
            // key값을 입력해 value 값을 얻어오는 get
            bw.write(hmap.get(Xpoint[i])+" ");
        }

        bw.close();

    }
}
