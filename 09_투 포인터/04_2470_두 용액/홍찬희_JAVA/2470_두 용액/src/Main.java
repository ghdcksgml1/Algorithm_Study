// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 29000 KB , 시간 : 388 ms
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] N_arr = new int[N];

        int min = 2000000001;
        int acidic=0; int alkaline=0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N_arr);

        int first_pointer = 0;
        int second_pointer = N-1;
        while(true){
            if(first_pointer >= second_pointer) break;

            int sum = N_arr[first_pointer] + N_arr[second_pointer];
            int abs_sum = Math.abs(sum);

            if(sum < 0){
                if(min > abs_sum){
                    min = abs_sum;
                    alkaline = N_arr[first_pointer];
                    acidic = N_arr[second_pointer];
                }
                first_pointer++;
            }else if(sum == 0){
                alkaline = N_arr[first_pointer];
                acidic = N_arr[second_pointer];
                break;
            }else{
                if(min > abs_sum){
                    min = abs_sum;
                    alkaline = N_arr[first_pointer];
                    acidic = N_arr[second_pointer];
                }
                second_pointer--;
            }
        }

        System.out.println(alkaline+" "+acidic);
    }
}
