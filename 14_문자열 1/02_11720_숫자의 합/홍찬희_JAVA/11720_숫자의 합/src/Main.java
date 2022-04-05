// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14296 KB , 시간 : 136 ms
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;
        for(int i=0;i<N;i++){
            result += (str.charAt(i)-'0');
        }
        System.out.println(result);
        bw.flush();
        bw.close();
        br.close();
    }
}