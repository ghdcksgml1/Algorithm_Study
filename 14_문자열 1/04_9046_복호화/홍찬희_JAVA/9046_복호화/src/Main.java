// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14324 KB , 시간 : 136 ms
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int[] chr = new int[26];
            int max = 0;
            String str = br.readLine();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == ' ') continue;
                int temp = str.charAt(j)-'a';
                chr[temp] += 1;
                max = Math.max(max,chr[temp]);
            }
            int cnt = 0;
            int c = 0;
            for(int j=0;j<26;j++){
                if(chr[j] == max){
                    cnt += 1;
                    c = j;
                }
            }
            if(cnt == 1){
                System.out.println((char)(c+'a'));
            }else{
                System.out.println("?");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}