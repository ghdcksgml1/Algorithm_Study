// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 34264 KB , 시간 : 400 ms
import java.util.*;
import java.io.*;

public class Main{
    public static int N,M;
    public static int[] arr;
    public static boolean[] visit;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void backtracking(int x,String num,int prev) throws IOException {
        if(x == M){
            bw.write(num+"\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(visit[i]) continue;
            visit[i] = true;
            backtracking(x+1,num + (arr[i]+" "),arr[i]);
            visit[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N];
        arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        backtracking(0,"",0);

        bw.flush();
        bw.close();
        br.close();
    }
}