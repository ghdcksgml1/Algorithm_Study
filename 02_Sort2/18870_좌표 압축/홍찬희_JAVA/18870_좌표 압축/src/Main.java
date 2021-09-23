// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 165344 KB , 시간 : 1704ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문제 입력 받기
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int[] N_arr = new int[N];

        str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        for(int i=0;i<N;i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }
        /*************************/

        int[] tmp = new int[N];
        for(int i=0;i<N;i++){
            tmp[i] = N_arr[i]; // tmp 배열에 N_arr 값 복사
        }

        Arrays.sort(tmp); // tmp 배열 오름차순으로 정렬

        int idx = 1; // 중복되지 않은 숫자 개수
        int[] result = new int[N];
        result[0] = tmp[0];

        // 중복되지 않은 숫자 개수 구하기
        for(int i=1;i<N;i++){
            if(result[idx-1] != tmp[i]){
                idx++;
                result[idx-1] = tmp[i];
            }
        }

        int tmp_num; // 임시로 값을 넣어 놓을 변수
        for(int i=0;i<N;i++){
            tmp_num = Arrays.binarySearch(result,0,idx,N_arr[i]);
            // 이진탐색을 통해 result 배열에서 N_arr[i]의 값을 찾음.
            // 0부터 idx까지 탐색하는 이유는 0에서 idx까지 정렬되어있기 때문에
            N_arr[i] = tmp_num;
            bw.write(N_arr[i]+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}