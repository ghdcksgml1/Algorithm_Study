// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14604 KB , 시간 : 144 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 소수인지 체크하는 함수
    private static boolean Prime_check(int N) {
        int cnt = 0;

        // 0이나 1이면 소수가 아니므로 false 반환
        if (N==0 || N==1) {
            return false;
        } else {
            // 공약수 개수 세기
            for (int i=1; i<=N; i++) {
                if (N % i == 0) {
                    cnt++;
                }
            }
            // 공약수가 2개이면 소수이므로 true 반환
            if (cnt == 2) return true;
            else return false;

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int N = Integer.parseInt(n);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[N];

        int cnt = 0;

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (Prime_check(arr[i]) == true) cnt++;
        }

        bw.write(cnt+" ");

        bw.close();

    }
}