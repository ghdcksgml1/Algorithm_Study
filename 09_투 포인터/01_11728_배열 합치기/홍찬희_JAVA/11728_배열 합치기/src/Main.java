import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] N_arr = new int[N];
        int[] M_arr = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            M_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N_arr);
        Arrays.sort(M_arr);

        int N_idx = 0;
        int M_idx = 0;
        for(int i=0;i<N+M;i++){
            if(N_idx == N){
                bw.write(M_arr[M_idx]+" ");
                M_idx++;
                continue;
            }
            if(M_idx == M){
                bw.write(N_arr[N_idx]+" ");
                N_idx++;
                continue;
            }
            if(N_arr[N_idx] < M_arr[M_idx]){
                bw.write(N_arr[N_idx]+" ");
                N_idx++;
            }else{
                bw.write(M_arr[M_idx]+" ");
                M_idx++;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
