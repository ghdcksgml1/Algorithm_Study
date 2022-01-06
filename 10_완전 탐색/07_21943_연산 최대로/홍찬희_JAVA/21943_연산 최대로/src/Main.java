// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 125864 KB , 시간 : 636 ms
import java.util.*;
import java.io.*;

public class Main{
    public static int N;
    public static int plus,mul;
    public static int max = Integer.MIN_VALUE;
    public static boolean[] visit_num;
    public static int[] visit_mark;
    public static int[] arr;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void backtracking(int x,int p, int m){
        if(p > plus || m > mul) return;
        if(x == N){
            max = Math.max(max,cal());
            return;
        }
        for(int i=0;i<N;i++){
            if(visit_num[i]) continue;
            visit_num[i] = true;
            list.add(arr[i]);
            if(x == 0){
                backtracking(x+1,p,m);
            }else{
                visit_mark[x] = 1; // '+'
                backtracking(x+1,p+1,m);
                visit_mark[x] = 2; // '*'
                backtracking(x+1,p,m+1);
                visit_mark[x] = 0;
            }
            list.remove(x);
            visit_num[i] =false;
        }
    }
    public static int cal(){
        ArrayList<Integer> temp_list = new ArrayList<>();
        int temp = list.get(0);
        for(int i=1;i<N;i++){
            if(visit_mark[i] == 1) temp += list.get(i);
            if(visit_mark[i] == 2) {
                temp_list.add(temp);
                temp = list.get(i);
            }
        }
        temp_list.add(temp);

        temp = 1;
        for(int i=0;i<temp_list.size();i++){
            temp *= temp_list.get(i);
        }

        return temp;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        visit_num = new boolean[N];
        visit_mark = new int[N];
        arr = new int[N];


        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");
        plus = Integer.parseInt(st.nextToken());
        mul = Integer.parseInt(st.nextToken());

        backtracking(0,0,0);
        System.out.println(max);

        bw.flush();
        bw.close();
        br.close();
    }
}