// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 112032 KB , 시간 : 1104ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    static int[] sorted; // sorted 배열을 전역변수로 사용하기위한 선언

    // mergeSort : O(NlogN)
    public static void merge(int[] data,int m,int middle,int n){
        int i = m;
        int j = middle+1;
        int k = m;

        // 인덱스 i와 j를 비교해가며 작은 값을 sorted배열에 넣는다.
        while(i<=middle && j<=n){
            if(data[i] <= data[j]){
                sorted[k] = data[i];
                i++;
            }else{
                sorted[k] = data[j];
                j++;
            }
            k++;
        }

        // 다 넣지 못한 값들을 넣어주는 과정
        if(i>middle){
            for(int t=j;t<=n;t++){
                sorted[k] = data[t];
                k++;
            }
        }else{
            for(int t=i;t<=middle;t++){
                sorted[k] = data[t];
                k++;
            }
        }

        // 정렬되어있는 데이터 sorted를 data에 복사해주는 과정
        for(int t=m;t<=n;t++){
            data[t] = sorted[t];
        }
    }
    public static void mergeSort(int[] data,int m,int n){
        if(m<n){
            int middle = (m+n) / 2;
            mergeSort(data,m,middle);
            mergeSort(data,middle+1,n);
            merge(data,m,middle,n);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int N = Integer.parseInt(str);
        int[] N_arr = new int[N];
        sorted = new int[N];

        for(int i=0;i<N;i++){
            str = br.readLine();
            N_arr[i] = Integer.parseInt(str);
        }

        mergeSort(N_arr,0,N-1);

        for(int i=0;i<N;i++){
            bw.write(N_arr[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
