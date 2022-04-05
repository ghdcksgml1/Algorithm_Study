// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 15824 KB , 시간 : 152 ms
import java.util.*;
import java.io.*;

public class Main{
    public static int N,M;
    public static boolean[] visit;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void backtracking(int x,int prev) throws IOException {
        if(x == M){
            for(int i=1;i<=N;i++){
                if(visit[i]) bw.write(i+" ");
            }
            bw.write("\n");
            return;
        }
        for(int i=prev;i<=N;i++){
            if(visit[i]) continue;
            visit[i] = true;
            backtracking(x+1,i);
            visit[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N+1];

        backtracking(0,1);

        bw.flush();
        bw.close();
        br.close();
    }
}