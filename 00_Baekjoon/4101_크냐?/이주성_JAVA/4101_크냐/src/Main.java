// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14132 KB , 시간 : 140 ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;

        while (true) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s," ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }
            else if (a > b) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

    }
}
