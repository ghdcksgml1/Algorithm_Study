// 언어 : JAVA , (성공/실패) : 2/3 , 메모리 : 19288 KB , 시간 : 224 ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static void quickSort(int[] arr, int start, int end) {
        // 원소가 한개인 경우
        if (start >= end) {
            return;
        }

        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {
            // 피봇보다 큰 값 찾기
            while(left <= end && arr[left] <= arr[pivot]) {
                left++;
            }
            // 피봇보다 작은 값 찾기
            while(right > start && arr[right] >= arr[pivot]) {
                right--;
            }

            // 엇갈리면 작은 데이터와 피벗 교체
            if (left > right) {
                swap(arr, right, pivot);
            }
            // 그렇지 않다면 작은 데이터와 큰 데이터 교체
            else {
                swap(arr, left, right);
            }
        }

        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);


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

        quickSort(arr, 0, arr.length-1);
        Arrays.toString(arr);
        for (int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
