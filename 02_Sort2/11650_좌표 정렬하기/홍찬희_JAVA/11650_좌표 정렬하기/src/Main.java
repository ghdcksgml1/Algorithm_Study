// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 50052 KB , 시간 : 832ms

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        // 처음에는 Integer wrapper 클래스로 정의했지만, int 자료형이 훨씬빨라서 바꿈
        // 메모리도 적게먹음
        int[][] N_arr = new int[N][2];


        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            N_arr[i][0] = Integer.parseInt(st.nextToken());
            N_arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N_arr, new Comparator<int[]>() { // Comparator 함수 재정의
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){ // N_arr[ ][0] 의 좌표가 같으면,
                    return o1[1]-o2[1]; // N_arr[ ][1]의 좌표 비교
                }else{ // 아니면
                    return o1[0]-o2[0]; // N_arr[ ][0]의 좌표 비교
                }
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<N;i++) {
            bw.write(N_arr[i][0] + " " + N_arr[i][1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
