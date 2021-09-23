// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 43152 KB , 시간 : 400ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int N = Integer.parseInt(str);

        int[] N_arr = new int[N]; // N개의 정수를 담는 배열
        int[] cnt = new int[8001]; // counting sort 할 배열

        int sum = 0; // 전체 배열의 합

        for(int i=0;i<N;i++){
            str = br.readLine();
            N_arr[i] = Integer.parseInt(str);
            sum += N_arr[i];
        }
        // counting sort를 위해 cnt배열에 값을 집어넣기
        for(int i=0;i<N;i++){
            cnt[N_arr[i]+4000] += 1;
        }
        // 1. 산술평균
        double arithmetic = Math.round((double)sum / (double)N);
        bw.write((int)arithmetic+"\n");
        // 2. 중앙값
        int idx = 0;
        for(int i=0;i<8001;i++){
            if(cnt[i] > 0){
                for(int j=0;j<cnt[i];j++) {
                    idx += 1;
                    if (idx == ((N + 1) / 2)) {
                        bw.write((i - 4000) + "\n");
                        break;
                    }
                }
            }
        }
        // 3. 최빈값
        int max = 0;
        int max_value = 0;
        for(int i=0;i<8001;i++){
            if(max < cnt[i]){
                max = cnt[i];
                max_value = i-4000;
            }
        }
        int max_cnt = 0;
        for(int i=0;i<8001;i++){
            if(max == cnt[i]){
                max_cnt += 1;
            }
        }
        if(max_cnt == 1){
            bw.write(max_value+"\n");
        }else{
            max_cnt = 0;
            for(int i=0;i<8001;i++){
                if(max == cnt[i]){
                    max_cnt += 1;
                    if(max_cnt == 2){
                        bw.write((i-4000)+"\n");
                        break;
                    }
                }
            }
        }
        // 4. 범위
        int small = 0;
        int large = 0;
        for(int i=0;i<8001;i++){
            if(cnt[i]>0){
                small = i-4000;
                break;
            }
        }
        for(int i=8000;i>=0;i--){
            if(cnt[i]>0){
                large = i-4000;
                break;
            }
        }
        bw.write((large-small)+"\n");

        /*******************/

        bw.flush();
        bw.close();
        br.close();
    }
}
