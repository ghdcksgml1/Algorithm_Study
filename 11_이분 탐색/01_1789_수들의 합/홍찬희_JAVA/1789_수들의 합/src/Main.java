// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 15908 KB , 시간 : 144 ms
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long S = Long.parseLong(br.readLine());

        long result = 1;
        long N = 0;
        while(result <= S){
            N++;
            result += N + 1;
        }
        bw.write(N+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}