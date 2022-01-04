// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 15672 KB , 시간 : 208 ms
import java.io.*;
import java.util.*;

public class Main {
    public static int N,M;
    public static int[][] arr;
    public static ArrayList<pair> vector1 = new ArrayList<>();
    public static ArrayList<pair> vector2 = new ArrayList<>();
    public static boolean[] check;
    public static int min = Integer.MAX_VALUE;
    public static void backtracking(int x,int sel){
        if(x == M){
            min = Math.min(min,chicken_distance());
            return;
        }
        for(int i=sel;i<vector2.size();i++){
            if(check[i]) continue;
            check[i] = true;
            backtracking(x+1,i);
            check[i] = false;
        }
    }
    public static int chicken_distance(){
        int result = 0;
        for(int i=0;i<vector1.size();i++){
            int temp = Integer.MAX_VALUE;
            for(int j=0;j<vector2.size();j++){
                if(!check[j]) continue;
                int dist = Math.abs(vector2.get(j).first-vector1.get(i).first)
                        +Math.abs(vector2.get(j).second-vector1.get(i).second);
                temp = Math.min(temp,dist);
            }
            result += temp;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][N+1];


        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1) vector1.add(new pair(i,j));
                if(arr[i][j] == 2) vector2.add(new pair(i,j));
            }
        }
        check = new boolean[vector2.size()];
        backtracking(0,0);
        System.out.println(min);
    }

    static class pair{
        int first;
        int second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
