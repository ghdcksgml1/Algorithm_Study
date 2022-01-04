// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14652 KB , 시간 : 136 ms
import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static boolean[] check = new boolean[10];
    public static ArrayList<pair> list;
    public static long answer = Long.MAX_VALUE;
    public static void backTracking(int x,long sour_mul,long bitter_sum){
        if(x!=0) answer = Math.min(answer,Math.abs(sour_mul-bitter_sum));
        if(x == N) return;
        for(int i=x;i<N;i++){
            if(!check[i]){
                check[i] = true;
                backTracking(x+1,sour_mul*list.get(i).first
                        ,bitter_sum+list.get(i).second);
                check[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            long sour,bitter;
            sour = Long.parseLong(st.nextToken());
            bitter = Long.parseLong(st.nextToken());
            list.add(new pair(sour,bitter));
        }
        backTracking(0,1,0);
        System.out.println(answer);
    }
    static class pair{
        long first,second;
        public pair(long first,long second){
            this.first = first;
            this.second = second;
        }

        public pair(){
            this.first = 0;
            this.second = 0;
        }
    }
}
