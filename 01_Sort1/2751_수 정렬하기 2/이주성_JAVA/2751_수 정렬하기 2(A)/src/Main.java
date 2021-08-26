// 언어 : JAVA , (성공/실패) : 1/5 , 메모리 : 111464 KB , 시간 : 1032 ms

import java.io.*;

public class Main {
    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        // 한개인 경우 제외하기 위해 start < end 조건
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        // 배열 복사
        for (int i=start; i<=end; i++) {
            tmp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        // 비교해서 작은것부터 채워넣기
        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        // 뒤쪽 데이터는 아까 복사한 상태 그대로 놔두면 되고
        // 앞쪽 데이터만 새로 복사해주면 된다.
        for (int i=0; i<=mid - part1; i++) {
            arr[index+i] = tmp[part1+i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

        int[] arr = new int[N];
        int[] tmp = new int[N];

        for (int i=0;i<N;i++) {
            s = br.readLine();

            int num = Integer.parseInt(s);
            arr[i] = num;
        }

        mergeSort(arr, tmp, 0, arr.length-1);
        for (int i=0; i<arr.length;i++) {
            bw.write(arr[i]+"\n");
        }

        bw.close();

    }
}