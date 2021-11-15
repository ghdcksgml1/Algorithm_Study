// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 15804 KB , 시간 : 140 ms

import java.io.*;

public class Main {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(fib(n)+" ");

        bw.close();
    }
}