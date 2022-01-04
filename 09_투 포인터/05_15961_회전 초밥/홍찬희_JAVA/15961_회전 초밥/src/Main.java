// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 170912 KB , 시간 : 532 ms
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 회전 초밥 벨트에 놓인 접시의 수
        int d = Integer.parseInt(st.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호
        int[] N_arr = new int[N]; // 값
        int[] cnt = new int[d+1]; // 초밥의 개수를 세기위한 배열
        int max_cnt = 0; // 현재까지의 최대 초밥의 가짓수
        int length = 0; // 현재 초밥의 가짓수

        for(int i=0;i<N;i++){
            N_arr[i] = Integer.parseInt(br.readLine());
        }

        int first_pointer = 0;
        int second_pointer = k-1;

        // 초기설정
        for(int i=0;i<k;i++){
            int num = N_arr[i];
            if(cnt[num] == 0){
                length++;
            }
            cnt[num]++;
        }
        // 쿠폰
        if(cnt[c] == 0){
            length++;
        }
        cnt[c]++;
        max_cnt = length;

        // 투 포인터
        while(true){
            if(first_pointer == N) break;

            int num_first = N_arr[first_pointer];
            cnt[num_first]--;
            if(cnt[num_first] == 0) length--;
            first_pointer++;

            second_pointer++;
            if(second_pointer == N) second_pointer %= N;
            int num_second = N_arr[second_pointer];
            if(cnt[num_second] == 0) length++;
            cnt[num_second]++;

            max_cnt = Math.max(max_cnt,length);
        }

        System.out.println(max_cnt);
    }
}
