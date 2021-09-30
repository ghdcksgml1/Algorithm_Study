// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 16052 KB , 시간 : 324 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] prime_number = new int[10001];
        int k = 0;

        for (int i=n;i<=m;i++) {

            int cnt =0;
            for (int j=1; j<=i; j++) {
                if (i % j ==0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                prime_number[k] = i;
                k++;
            }

        }

        int sum =0;

        for (int i=0; i<10001; i++) {
            if (prime_number[i] != 0) {
                sum += prime_number[i];
            }
        }

        if (sum == 0) {
            bw.write(-1+" ");
        } else {
            bw.write(sum+"\n"+prime_number[0]);
        }


        bw.close();

    }
}