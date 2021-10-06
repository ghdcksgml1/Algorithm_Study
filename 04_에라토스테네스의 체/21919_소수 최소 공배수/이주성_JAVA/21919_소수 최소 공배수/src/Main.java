// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14604 KB , 시간 : 144 ms

import java.io.*;
import java.util.Arrays;
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

        int[] result = new int[N];
        int index = 0;

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<N; i++) {
            if (Prime_check(arr[i]) == true) {
                // 소수끼리의 곱 = 최소공배수
                if (arr[i] > 0) {
                    result[index] = arr[i];
                    index++;
                }
            }
        }

//        for(int i=0; i<N ;i++) {
//            bw.write(result[i]+" ");
//        }
//        bw.write("\n");

        Arrays.sort(result);

//        for(int i=0; i<N ;i++) {
//            bw.write(result[i]+" ");
//        }
//        bw.write("\n");

        int[] cnt = new int[1000001];

        for(int i=0; i<N;i++) {
            cnt[result[i]] += 1;
        }

//        for(int i=0; i<1000001 ;i++) {
//            if (cnt[i] >=1) {
//                bw.write(i+" ");
//            }
//        }
//        bw.write("\n");

        int mul = 1;

        for (int i=1; i<1000001; i++) {
            if (cnt[i] >= 1) {
                mul = mul * i;
            }
        }

        if (mul >= 2) {
            bw.write(mul+" ");
        } else {
            bw.write("-1"+" ");
        }


        bw.close();

    }
}