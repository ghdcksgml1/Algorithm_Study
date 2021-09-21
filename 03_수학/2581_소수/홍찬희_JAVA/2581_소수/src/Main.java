// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14192 KB , 시간 : 120 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] N_arr = new boolean[N+1];

        N_arr[0]=true;N_arr[1]=true;

        for(int i=2;i*i<=N;i++){
            for(int j=2;i*j<=N;j++){
                N_arr[i*j] = true;
            }
        }

        int sum = 0;
        for(int i=M;i<=N;i++){
            if(N_arr[i] == false)
                sum += i;
        }
        if(sum == 0) {
            System.out.println("-1");
            return;
        }

        System.out.println(sum);
        for(int i=M;i<=N;i++){
            if(N_arr[i] == false) {
                System.out.println(i);
                break;
            }
        }
    }
}
