// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 23972 KB , 시간 : 420 ms

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static void stringSort(String[] arr, int N) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 길이가 같으면
                if (o1.length() == o2.length()) {
                    // 오름차순
                    return o1.compareTo(o2);
                } else {
                    // 길이가 짧은 순
                    return o1.length() - o2.length();
                }
            }
        });
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

        String[] arr = new String[N];

        for (int i=0; i<N; i++) {
            s = br.readLine();
            arr[i] = s;
        }

        stringSort(arr, N);

        String[] result = new String[N];
        int index = 1;
        result[0] = arr[0];

        // ==나 !=는 비교하고자 하는 대상의 주소값을 비교한다.
        // 아래는 이 사실을 모르고 작성해서 틀린 예제
//        // 같은 단어가 여러 번 입력된 경우 제거
//        for (int i=1; i<N; i++) {
//            if (result[index-1] != arr[i]) {
//                result[index] = arr[i];
//                index++;
//            }
//        }
        for (int i=1; i<N; i++) {
            if (!result[index-1].equals(arr[i])) {
                result[index] = arr[i];
                index++;
            }
        }


        for (int i=0; i<N; i++) {
            if (result[i] != null) {
                bw.write(result[i]+"\n");
            }
        }

        bw.close();

    }
}
