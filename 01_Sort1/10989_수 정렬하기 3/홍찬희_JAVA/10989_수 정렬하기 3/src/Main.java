// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 301288 KB , 시간 : 1912ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] N_arr = new int[10001];

        for(int i=0;i<N;i++){
            int idx = Integer.parseInt(br.readLine());
            N_arr[idx] += 1;
        }

        for(int i=0;i<=10000;i++){
            if(N_arr[i] > 0){
                for(int j=0;j<N_arr[i];j++){
                    bw.write(i+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
