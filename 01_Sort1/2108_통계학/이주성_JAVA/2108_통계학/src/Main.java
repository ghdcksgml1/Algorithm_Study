// 언어 : JAVA , (성공/실패) : 1/7 , 메모리 : 48684 KB , 시간 : 692 ms

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            s = br.readLine();
            arr[i] = Integer.parseInt(s);
        }

        // 1. 산술평균 시간복잡도: O(N)
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        double am = (double)sum / (double)N; // 형변환 기법

        // String.format("%.원하는 소수점 자릿수f", a)
        bw.write(String.format("%.0f", am)+"\n");


        // 2. 중앙값 O(NlogN)
        Arrays.sort(arr);

        bw.write(arr[arr.length/2]+"\n");


        //3. 최빈값
        int[] cnt = new int[8001];
        for (int i=0; i<N; i++) {
            cnt[arr[i]+4000] += 1;
        }

        // 최댓값
        int max = 0; // 중복의 최댓값
        for(int i=0;i<8001;i++){
            if(cnt[i] > max) {
                max = cnt[i];
            }
        }

        int[] max_index = new int[8001];
        int j = 0;

        for (int i=0; i<8001; i++) {
            if (max == cnt[i]){
                max_index[j] = i;
                j++;
            }
        }


        for (int i=0; i<2; i++) {
            if (max_index[i] == 0) {
                max_index[i] += 50000;
            }
        }

        if (max_index[1] < 10000) {
            bw.write(max_index[1]-4000+"\n");
        } else {
            bw.write(max_index[0]-4000+"\n");
        }


        // 4. 범위
        Arrays.sort(arr);
        int range = arr[arr.length-1] - arr[0];
        bw.write(range+"\n");

        bw.close();
    }
}
