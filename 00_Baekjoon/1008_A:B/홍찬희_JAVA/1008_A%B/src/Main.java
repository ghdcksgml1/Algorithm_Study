// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14572 KB , 시간 : 152ms

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        System.out.printf("%.9f",A/B);
    }
}
