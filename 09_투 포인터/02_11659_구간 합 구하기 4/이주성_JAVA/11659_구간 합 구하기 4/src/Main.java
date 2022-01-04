// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 63068 KB , 시간 : 748 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N];
        sum[0] = arr[0];

        for(int i=1; i<N; i++) {
            sum[i] = arr[i] + sum[i-1];
        }

//        for(int i=0; i<N; i++) {
//            bw.write(sum[i]+" ");
//        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a <2) {
                bw.write(sum[b-1]+"\n");
            } else {
                bw.write(sum[b-1] - sum[a-2]+"\n");
            }
        }
        bw.close();
    }
}