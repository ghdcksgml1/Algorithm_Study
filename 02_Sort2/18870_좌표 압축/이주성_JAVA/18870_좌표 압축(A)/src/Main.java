// 시간 초과한 오답

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
        // 여기선 또 Integer[]로 선언하면 나중에 중복 제거할 때 제거가 안된다..
        // 뭔가 기준이 있는 것 같은데 모르겠다 ㄴㅇ러쟈ㅐ도룬ㅇㄴ러ㅏㅗ다ㅓ냐ㅣㄷㄴ
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
        for (int i=0; i<N; i++) {
            // 인덱스 값을 추출하는 함수로 indexOf를 썼는데
            // 그냥 int[] 배열에선 안먹히더니
            // Integer[] 배열로 선언해서 해주니까 된다.. 이유가 뭘까..
            // indexOf의 시간복잡도는 최악의 경우 O(nm)이다.
            // (n은 string 길이, m은 찾고자하는 길이)
            // 근데 여기서 n은 1,000,000이고 X는 2*10^9이다.
            // 그러면 nm은 2*10^15이므로 시간제한 2초에서 시간 초과...
            index = Arrays.asList(result).indexOf(Xpoint[i]);
            Xpoint[i] = index;
        }

        // 출력
        for (int i=0; i<N; i++) {
            bw.write(Xpoint[i]+" ");
        }

        bw.close();

    }
}
