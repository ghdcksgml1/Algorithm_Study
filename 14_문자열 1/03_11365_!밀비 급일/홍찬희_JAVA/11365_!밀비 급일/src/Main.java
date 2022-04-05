// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14220 KB , 시간 : 124 ms
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";
        while(true){
            str = br.readLine();
            if(str.equals("END")) break;
            StringBuffer stb = new StringBuffer(str);
            str = stb.reverse().toString();
            bw.write(str+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}