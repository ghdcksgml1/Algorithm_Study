// 언어 : JAVA , (성공/실패) : 1/3 , 메모리 : 32764 KB , 시간 : 364 ms
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int first_pointer = 0;
        int second_pointer = 0;
        int max_length = 0;
        boolean trigger = false;
        int[] cnt = new int[100001];
        cnt[arr[second_pointer]]++;
        while(true){
//            System.out.println("1: "+first_pointer+", 2: "+second_pointer);
            if(!trigger)
                second_pointer++;
            else
                first_pointer++;
            if(second_pointer<N){
                if(!trigger)
                    cnt[arr[second_pointer]]++;
                // K를 넘어갈경우
                if(cnt[arr[second_pointer]] > K){
                    max_length = Math.max(max_length, second_pointer-first_pointer);
                    cnt[arr[first_pointer]]--;
                    trigger = true;
                }else{
                    trigger = false;
                }
            }else{
                max_length = Math.max(max_length,second_pointer-first_pointer);
                break;
            }
        }
        System.out.println(max_length);
    }
}
