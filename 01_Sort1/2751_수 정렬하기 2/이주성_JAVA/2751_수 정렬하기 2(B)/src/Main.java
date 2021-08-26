// 실패 사례
// 버블정렬의 시간복잡도는 O(N^2)로 N의 개수가 최대 100만이면 10억이다.
// 대충 1초 = 1억이므로 제한시간이 2초인 이 문제에서 시간초과로 실패

import java.io.*;

public class Main {

    private static void bubbleSort(int[] arr, int last) {
        if (last > 0) {
            for(int i=1; i<=last; i++) {
                if (arr[i-1] >= arr[i]) {
                    swap(arr, i-1 , i);
                }
            }
            bubbleSort(arr, last-1);
        }
    }

    private static void swap (int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }


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

        bubbleSort(arr, arr.length-1);

        for(int i=0; i<N; i++) {
            bw.write(arr[i]+"\n");
        }

        bw.close();
    }
}
