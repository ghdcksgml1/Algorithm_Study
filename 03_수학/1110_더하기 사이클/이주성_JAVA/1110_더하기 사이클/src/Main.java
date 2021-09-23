// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14272 KB , 시간 : 136 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int x = n;
        int cnt =0;

        while (true) {
            int i = ((x/10) + (x%10));
            x = ((x % 10) * 10) + (i % 10);
            cnt++;

            if (n == x) {
                break;
            }
        }

        bw.write(cnt+"");

        bw.close();

    }
}
