// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14156 KB , 시간 : 120 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int N_tmp = N; // N 복사
        int N_first; // 첫째 자리
        int N_second; // 둘째 자리
        int N_sum; // 첫째 자리 + 둘째 자리
        int cnt = 0;

        // 처음 N_tmp와 N이 같기때문에
        // do-while문을 써준다.
        do{
            // ex.) 26
            cnt++;
            N_first = N_tmp % 10; // N_first : 6
            N_second = N_tmp / 10; // N_second : 2
            N_sum = N_first + N_second; // N_sum : 8

            N_second = N_first; // N_second : 6
            N_first = N_sum % 10; // N_first : 8
            N_tmp = N_second * 10 + N_first; // N_tmp : 68
        }while(N_tmp != N);

        System.out.println(cnt);
    }
}
