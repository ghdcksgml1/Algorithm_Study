// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 55912 KB , 시간 : 756 ms
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] N_arr = new long[N];
        st = new StringTokenizer(br.readLine());
        N_arr[0] = Long.parseLong(st.nextToken());
        for(int i=1;i<N;i++){
            N_arr[i] = N_arr[i-1] + Long.parseLong(st.nextToken());
        }

        for(int t=0;t<M;t++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-2;
            int j = Integer.parseInt(st.nextToken())-1;

            long result;
            if(i>=0){
                result = N_arr[j] - N_arr[i];
            }else{
                result = N_arr[j];
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
