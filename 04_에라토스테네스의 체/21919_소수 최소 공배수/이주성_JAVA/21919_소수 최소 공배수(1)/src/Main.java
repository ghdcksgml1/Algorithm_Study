// 언어 : JAVA , (성공/실패) : 1/10 , 메모리 : 16776 KB , 시간 : 240 ms

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] Et_arr = new boolean[1000001];
    public static void ET() {
        for(int i=2; i<= 1000000; i++) {
            if(Et_arr[i] == true)
                continue;
            for(int j=2; i*j<=1000000; j++) {
                Et_arr[i*j]=true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i=0; i<N; i++) {
            arr[i] = st.nextToken();
        }

        // 소수 구하기
        ET();

        // 중복 제거하기 위해 정렬
        Arrays.sort(arr);

        // 범위 무한대인 BigInteger 사용
        BigInteger result = BigInteger.ONE;
        String prev = "";
        for(int i=0; i<N; i++) {
            if(arr[i].equals((prev))) continue;
            prev = arr[i];

            // 소수이면, result에 곱해주기
            if(Et_arr[Integer.parseInt(arr[i])] == false) {
                BigInteger bigNum = new BigInteger(arr[i]);
                result = result.multiply(bigNum);
            }
        }

        if(result != BigInteger.ONE) {
            bw.write(result+" ");
        }else {
            bw.write("-1"+" ");
        }

        bw.close();

    }
}