import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] Et_arr = new boolean[1000001];
    public static void ET(){
        Et_arr[1] = true;

        for(int i=2; i*i<=1000000; i++) {
            if(Et_arr[i] == true) continue;
            for(int j=2; i*j<=1000000; j++) {
                Et_arr[i*j] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 소수 구하기
        ET();

        for(int i=M; i<=N; i++) {
            if (Et_arr[i] == false) {
                bw.write(i+"\n");
            } else continue;
        }

        bw.close();
    }
}
