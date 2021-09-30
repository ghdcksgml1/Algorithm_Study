// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 16068 KB , 시간 : 192 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 유클리드 호제법
    private static int Euclidean(int a, int b) {
        if (a<b) {
            int k = a;
            a = b;
            b = k;
        }
        int r = a % b;
        if (r == 0){
            return b;
        } else {
            return Euclidean(b,r);
        }
    }

    // 최소 공배수 = 두 수 곱한 값 / 최대 공약수
    private static int lcm(int a, int b) {
        return a * b / Euclidean(a, b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int n = Integer.parseInt(N);
        int arr[][] = new int[n][2];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<n; i++) {
            Arrays.sort(arr[i]);
            bw.write(lcm(arr[i][0], arr[i][1])+"\n");
        }



        bw.close();

    }
}