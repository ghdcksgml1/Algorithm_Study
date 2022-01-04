// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 14528 KB , 시간 : 132 ms

import java.util.*;
import java.io.*;

class Jump{
    public int j;
    public int jj;

    public Jump(int j,int jj){
        this.j = j;
        this.jj = jj;
    }
}

public class Main {
    public static int N;
    public static int jjj;
    public static int answer = 1000000000;
    public static Jump[] j_arr;
    public static void backtracking(int x,boolean value, int sum){
        if(x == N-1){
            answer = Math.min(answer,sum);
            return;
        }
        if(x>N-1) return;
        backtracking(x+1,value,sum+j_arr[x].j);
        backtracking(x+2,value, sum+j_arr[x].jj);
        if(!value) {
            backtracking(x+3,true,sum+jjj);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        j_arr = new Jump[N-1];
        for(int i=0;i<N-1;i++){
            st = new StringTokenizer(br.readLine()," ");
            int j = Integer.parseInt(st.nextToken());
            int jj = Integer.parseInt(st.nextToken());
            j_arr[i] = new Jump(j,jj);
        }
        jjj = Integer.parseInt(br.readLine());

        backtracking(0,false,0);
        System.out.println(answer);

    }
}
