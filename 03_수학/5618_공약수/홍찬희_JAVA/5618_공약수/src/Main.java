// 언어 : JAVA , (성공/실패) : 2/0 , 메모리 : 18188 KB , 시간 : 568 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] N_arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 값 받기
        int max = 0;
        for(int i=0;i<N;i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
            if(max < N_arr[i])
                max = N_arr[i];
        }

        // max까지의 수를 모두 돌면서 공약수 찾아내기
        for(int i=1;i<=max;i++){
            if(N==2 && N_arr[0] % i ==0 && N_arr[1] %i == 0)
                bw.write(i+"\n");
            if(N==3 && N_arr[0] % i ==0 && N_arr[1] %i == 0 && N_arr[2] % i == 0)
                bw.write(i+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
