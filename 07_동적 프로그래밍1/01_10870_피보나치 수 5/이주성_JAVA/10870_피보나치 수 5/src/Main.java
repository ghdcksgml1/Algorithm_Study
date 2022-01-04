// 언어 : JAVA , (성공/실패) : 2/3 , 메모리 : 15848 KB , 시간 : 144 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] fib = new int[n+1];

        for(int i=0; i<=n; i++) {
            if (i == 0) fib[i] = 0;
            else if (i == 1) fib[i] = 1;
            else {
                fib[i] = fib[i-1] + fib[i-2];
            }
        }

        bw.write(fib[n]+" ");

        bw.close();
    }
}
