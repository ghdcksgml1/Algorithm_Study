// 언어 : JAVA , (성공/실패) : 3/5 , 메모리 : 340056 KB , 시간 : 2008 ms
import java.io.*;

public class Main {

    // 계수 정렬
    private static void countSort(int[] arr, int[] cnt ,int N) {
        for(int i=0; i<N; i++) {
            cnt[arr[i]] += 1;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

        int[] arr = new int[N];
        int[] cnt = new int[10001];

        for (int i=0; i<N; i++) {
            s = br.readLine();
            arr[i] = Integer.parseInt(s);
        }

        countSort(arr, cnt,  N);

        // i를 cnt[i] 값만큼 출력
        for (int i=1; i<cnt.length; i++) {
            for (int j=0; j < cnt[i]; j++) {
                bw.write(i+"\n");
            }
        }

        bw.close();
    }
}