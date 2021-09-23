// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 19520 KB , 시간 : 240ms

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    // 퀵소트
    // 평균속도 : O(N logN), 최악의 경우 : O(N^2)
    public static void quickSort(int[] data,int start,int end){
        // start가 end와 크거나 같다는건, 비교할 값이 1개이거나 없다는 것이므로
        // return해주기
        if(start>=end)
            return;
        int key = start; // 피벗 값을 시작값으로 설정
        int i = start+1; // 피벗의 오른쪽에서 시작
        int j = end; // 범위의 맨 끝에서 시작
        int temp;

        // i가 j보다 작거나 같을 경우에만 루프를 돈다.
        while(i<=j) {
            // 피벗의 값보다 data[i]의 값이 클때까지 i를 1씩 증가
            while (data[key] >= data[i] && i <= end) {
                i++;
            }
            // 피벗의 값보다 data[j]의 값이 작을때까지 j를 1씩 감소
            while (data[key] <= data[j] && j > start) {
                j--;
            }

            // i가 j보다 크다면, 엇갈린 것이므로
            // data[key]보다 작은 data[j]와 값을 바꾼다.
            if (i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {
                // 그렇지 않으면,
                // i와 j를 교체
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        // 마지막은 인덱스 key와 j가 바뀌므로,
        // j의 왼쪽과 오른쪽으로 나눠 함수를 호출한다.
        quickSort(data,start,j-1);
        quickSort(data,j+1,end);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        String str = bw.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int[] N_arr = new int[10001];
        int N = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            str = bw.readLine();
            st = new StringTokenizer(str," ");
            int num = Integer.parseInt(st.nextToken());
            N_arr[i] = num;
        }
        quickSort(N_arr,0,N-1);
        for(int i=0;i<N;i++){
            System.out.println(N_arr[i]);
        }
    }
}
