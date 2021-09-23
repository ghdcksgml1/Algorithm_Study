// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14152 KB , 시간 : 128 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int Et(boolean[] N_arr,int n,int k){
        int cnt = 0;
        for(int i=2;i<=n;i++){
            for(int j=1;j*i<=n;j++){
                if(N_arr[i*j] == false){
                    N_arr[i*j] = true;
                    cnt++;
                    if(cnt == k)
                        return i*j;
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] N_arr = new boolean[N+1];

        System.out.println(Et(N_arr, N, K));
    }
}
