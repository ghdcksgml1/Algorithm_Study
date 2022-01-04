import java.util.*;
import java.io.*;

public class Main {
    public static int N,M;
    public static int min = Integer.MAX_VALUE;
    public static int temp_min = Integer.MAX_VALUE;
    public static boolean[] temp_check;
    public static int min_a,min_b;
    public static ArrayList<Integer>[] list;
    public static boolean[] check;
    public static void backtracking(int x,int prev){
        if(x == 2){
            ArrayList<Integer> temp = cal();
            if(min > temp.get(2)){
                min = temp.get(2);
                min_a = temp.get(0);
                min_b = temp.get(1);
            }
            return;
        }
        for(int i=prev;i<=N;i++){
            if(check[i]) continue;
            check[i] = true;
            backtracking(x+1,i);
            check[i] = false;
        }
    }
    public static ArrayList<Integer> cal(){
        ArrayList<Integer> li = new ArrayList<>();
        int result = 0;
        for(int i=1;i<=N;i++){
            if(check[i]) {
                li.add(i);
                continue;
            }
            temp_min = Integer.MAX_VALUE;
            temp_check = new boolean[N+1];
            distance(i,1);
            result += temp_min;
        }
        li.add(result);
        return li;
    }
    public static void distance(int x,int depth){
        if(temp_check[x]) return;
        for(int i=0;i<list[x].size();i++){
            if(check[list[x].get(i)]) {
                temp_min = Math.min(temp_min,depth*2);
            }
            else{
                temp_check[x] = true;
                distance(list[x].get(i),depth+1);
                temp_check[x] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        check = new boolean[N+1];

        for(int i=0;i<=N;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            list[first].add(second);
            list[second].add(first);
        }
        backtracking(0,1);
        System.out.println(min_a+" "+min_b+" "+min);
    }
}
