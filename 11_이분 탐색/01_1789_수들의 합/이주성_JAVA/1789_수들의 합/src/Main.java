import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long S;

    static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = Long.parseLong(br.readLine());
    }

    static void pro() throws IOException {
        long sum = 0;
        int cnt = 1;

        for (int i = 2; ; i++) {

            // 더했을 때 S를 넘는다면
            if(sum + i >= S) {
                bw.write(cnt+" ");
                break;
                
            // 더해주기
            } else {
                sum += i;
                cnt++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        init();

        pro();

        bw.close();
    }

}