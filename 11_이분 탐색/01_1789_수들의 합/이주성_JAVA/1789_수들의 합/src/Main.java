/*
- sum>=S가 되는 지점까지 1부터 더해주기
- 같으면 cnt 더 크면 cnt-1 출력
*/

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());

        long sum = 0;
        int cnt = 0;

        for (long i = 1; i < S; i++) {
            if (sum == S) {
                break;
            } else if (sum > S) {
                cnt--;
                break;
            }

            sum += i;
            cnt++;
        }

        bw.write(cnt+" ");

        bw.close();

    }

}