// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 15908 KB , 시간 : 144 ms
import java.util.*;
import java.io.*;

public class Main{
    public static int N;
    public static ArrayList<Integer> list1 = new ArrayList<>(); // 숫자
    public static ArrayList<Character> list2 = new ArrayList<>(); // 수식
    public static boolean[] check_list1;
    public static int mx = Integer.MIN_VALUE;
    public static void backtracking(int x,int prev){
        mx = Math.max(mx,calculate());
        if(x == N/2) return;
        for(int i=prev;i<N/2;i++){
            if(check_list1[i]) continue;
            check_list1[i] = true;
            check_list1[i+1] = true;
            backtracking(x+1,i);
            check_list1[i] = false;
            check_list1[i+1] = false;
        }
    }
    public static int calculate(){
        ArrayList<Integer> cpy_list1 = new ArrayList<>();
        ArrayList<Character> cpy_list2 = new ArrayList<>();
        cpy_list1.addAll(list1);
        cpy_list2.addAll(list2);
        // 괄호 부분 먼저 계산
        // for 루프를 돌면서 i와 i+1이 true인곳을 탐색
        for(int i=0;i<N-1;i++){
            if(check_list1[i] && check_list1[i+1]){ // 괄호가 씌워진 곳
                int result = list_cal(cpy_list1.get(i),cpy_list1.get(i+1),cpy_list2.get(i));
                cpy_list1.set(i,result);cpy_list1.set(i+1,0);cpy_list2.set(i,'+');
                i++; // 2칸 건너뛰게하기위해
            }
        }
        int cal = cpy_list1.get(0);
        for(int i=0;i<cpy_list2.size();i++){
            cal = list_cal(cal,cpy_list1.get(i+1),cpy_list2.get(i));
        }
        return cal;
    }
    public static int list_cal(int a,int b,char c){
        if(c == '+'){
            return a+b;
        }else if(c == '-'){
            return a-b;
        }else if(c == '*'){
            return a*b;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        check_list1 = new boolean[N];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9') list1.add(str.charAt(i)-'0');
            else list2.add(str.charAt(i));
        }

        backtracking(0,0);
        bw.write(mx+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}