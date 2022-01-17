// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 28008 KB , 시간 : 304 ms
import java.util.*;
import java.io.*;

public class Main{
    public static int N,M;
    public static boolean[] visit;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void backtracking(int x,String num) throws IOException {
        if(x == M){
            bw.write(num+"\n");
            return;
        }
        for(int i=1;i<=N;i++){
            if(visit[i]) continue;
            visit[i] = true;
            backtracking(x+1,num+(i+" "));
            visit[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N+1];

        backtracking(0,"");

        bw.flush();
        bw.close();
        br.close();
    }
}