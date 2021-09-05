// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 50320 KB , 시간 : 856ms

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int N = Integer.parseInt(str);
        int[][] N_arr = new int[N][2];


        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N_arr[i][0] = Integer.parseInt(st.nextToken());
            N_arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N_arr,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1,int[] o2){
                // 11650_좌표 정렬하기 문제에서 아래의 조건만 바꿔줬다.
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }else{
                    return o1[1] - o2[1];
                }
            }
        });

        for(int i=0;i<N;i++){
            bw.write(N_arr[i][0]+" "+N_arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
