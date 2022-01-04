// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 22292 KB , 시간 : 1112 ms
import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static int Z=1;
    public static int[][] arr;
    public static boolean[] check = new boolean[20];
    public static int min = Integer.MAX_VALUE;
    public static void backtracking(int depth){
        if(depth == N) {
            stat_sum();
            return;
        }
        check[depth] = true;
        backtracking(depth+1);
        check[depth] = false;
        backtracking(depth+1);

    }
    public static void stat_sum(){
        int first_result = 0;
        int second_result = 0;

        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(check[i] && check[j]){
                    first_result += arr[i][j]+arr[j][i];
                }else if(!check[i] && !check[j]){
                    second_result += arr[i][j] + arr[j][i];
                }
            }
        }

        min = Math.min(min, Math.abs(first_result-second_result));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backtracking(0);
        System.out.println(min);
    }
}