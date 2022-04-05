// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 15924 KB , 시간 : 144 ms
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        if(Double.compare((long)Math.sqrt(n),Math.sqrt(n)) == 0)
            bw.write((long)Math.sqrt(n)+"\n");
        else
            bw.write((long)Math.sqrt(n)+1+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}