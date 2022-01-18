import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        long start = 0;
        long end = N;
        long mid = 0;
        long min = Long.MAX_VALUE;

        while (start <= end) {
            mid = (start + end) / 2;

            long target = (long)Math.pow(mid, 2);

            // 범위가 넘어가면 음수 되는 것 주의
            if (target >= 0) {
                if (target >= N) {
                    min = Math.min(min, mid);
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        bw.write(min+" ");



        bw.close();
    }

}