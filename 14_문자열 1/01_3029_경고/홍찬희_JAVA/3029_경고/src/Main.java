// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14408 KB , 시간 : 136 ms
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] start = br.readLine().split(":");
        String[] end = br.readLine().split(":");

        int hh = Integer.parseInt(end[0]) - Integer.parseInt(start[0]);
        int mm = Integer.parseInt(end[1]) - Integer.parseInt(start[1]);
        int ss = Integer.parseInt(end[2]) - Integer.parseInt(start[2]);

        if(hh == 0 && mm == 0 && ss == 0){
            System.out.println("24:00:00");
            return;
        }

        if(ss<0){
            ss += 60;
            mm--;
        }
        if(mm<0){
            mm += 60;
            hh--;
        }
        if(hh<0){
            hh += 24;
        }
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);
        bw.flush();
        bw.close();
        br.close();
    }
}