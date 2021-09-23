// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14052 KB , 시간 : 124 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] et_arr = new boolean[1001];

    // 에라토스테네스의 체
    public static void Et(){
        for(int i=2;i*i<=1000;i++){
            if(et_arr[i] == true) continue;
            for(int j=2;i*j<=1000;j++){
                et_arr[i*j] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] N_arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<N;i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        et_arr[1] = true; // 1은 소수가 아니다.
        Et();

        int cnt = 0;
        for(int i=0;i<N;i++){
            if(et_arr[N_arr[i]] == false) // N_arr[i]이 소수인지 아닌지 확인
                cnt++;
        }

        System.out.println(cnt);
    }
}
