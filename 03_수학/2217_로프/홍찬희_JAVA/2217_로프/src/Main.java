// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 25528 KB , 시간 : 304 ms

import java.io.*;
import java.util.Arrays;

public class Main {
public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] N_arr = new int[N];
        for(int i=0;i<N;i++){
            N_arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(N_arr);

        int max = 0;
        int cnt = 1;

        for(int i=N-1;i>=0;i--){
            if(N_arr[i]*cnt > max)
                max = N_arr[i]*cnt;
            cnt++;
        }
        System.out.println(max);
    }
}
