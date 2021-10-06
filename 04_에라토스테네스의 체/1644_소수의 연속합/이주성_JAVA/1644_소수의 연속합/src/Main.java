// 언어 : JAVA , (성공/실패) : 1/3 , 메모리 : 21380 KB , 시간 : 268 ms

import java.io.*;

public class Main {
    public static boolean[] Et_arr = new boolean[4000001];
    public static void Et() {
        Et_arr[0] = true;
        Et_arr[1] = true;

        for(int i=2; i<=4000000; i++) {
            if(Et_arr[i] == true) continue;
            for(int j=2; i*j<=4000000; j++) {
                Et_arr[i*j] = true;
            }
        }
    }
    // N보다 작은 소수의 개수 구하는 메소드
    public static int PN(int N) {
        int cnt = 0;

        for(int i=2; i<=N; i++) {
            if (Et_arr[i] == false) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 소수 구하기
        Et();
        int pn = PN(N);
        int[] prime_num = new int[pn];
        int index = 0;

        for(int i=0; i<=N; i++) {
            if (Et_arr[i] == false) {
                prime_num[index] = i;
                index++;
            }
        }

//        for(int i=0; i<pn; i++) {
//            bw.write(prime_num[i]+" ");
//        }

// 시간초과 !!!!!!!!!!!!!!!!!!!!!
//        for (int i=pn-1 ; i>=0; i--) {
//            int sum = prime_num[i];
//            for(int j= i-1; j>=0; j--) {
//                if (sum <= N) {
//                    sum += prime_num[j];
//                    if (sum == N) {
//                        cnt++;
//                        break;
//                    }
//                }
//            }
//        }

        // 합이 크면 시작 Index를 늘리고
        // 합이 작으면 끝 Index를 늘리는 방식

        int start=0, end=0, sum=0, cnt =0;

        while(true) {
            if (sum >= N) {
                sum -= prime_num[start];
                start++;
            }
            else if (end == pn) {
                break;
            }
            else {
                sum += prime_num[end];
                end++;
            }

            if (sum == N) {
                cnt++;
            }

        }

        bw.write(cnt+" ");

        bw.close();

    }
}