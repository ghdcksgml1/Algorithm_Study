// 언어 : JAVA , (성공/실패) : 2/3 , 메모리 : 14848 KB , 시간 : 196 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2 -1) {
            quickSort(arr, start, part2-1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap (arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);
        int[] arr = new int[N];
        for (int i=0;i<N;i++) {
            String str = br.readLine();
            int num = Integer.parseInt(str);
            arr[i] = num;
        }

        quickSort(arr);
        Arrays.toString(arr);
        for (int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}