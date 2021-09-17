// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 21704 KB , 시간 : 284 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] Et_arr = new boolean[1000001];
    public static void Et(){
        for(int i=2;i*i<=1000000;i++){
            if(Et_arr[i] == true) continue;
            for(int j=2;i*j<=1000000;j++){
                Et_arr[i*j] = true;
            }
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Et_arr[1] = true; // 1은 소수가 아니다.
        Et();

        for(int i=N;i<=M;i++){
            if(Et_arr[i] == false){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
