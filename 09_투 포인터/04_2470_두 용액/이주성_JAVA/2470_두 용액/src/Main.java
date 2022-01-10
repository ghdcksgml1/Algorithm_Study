// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 28628 KB , 시간 : 404 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        Result(arr, N);

        bw.write(a+" "+b);
        bw.close();
    }

    public static void Result(int[] arr, int n) {
        int left = 0;
        int right = n-1;
        int max = 2000000000;

        while (left < right) {
            int sum = arr[left]+arr[right];
            if (Math.abs(sum) < max) {
                a = arr[left];
                b = arr[right];
                max = Math.abs(sum);
            }

            if(sum > 0) {
                right--;
            } else {
                left++;
            }


        }

    }
}