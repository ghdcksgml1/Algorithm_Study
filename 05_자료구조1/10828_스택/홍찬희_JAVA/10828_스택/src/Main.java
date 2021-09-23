// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 18652 KB , 시간 : 396 ms

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] arsg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String method = st.nextToken();
            int num;
            if(method.equals("push")){
                num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(method.equals("pop")){
                if(stack.empty() == false) {
                    System.out.println(stack.peek());
                    stack.pop();
                }else{
                    System.out.println("-1");
                }
            }else if(method.equals("size")){
                System.out.println(stack.size());
            }else if(method.equals("empty")){
                if(stack.empty() == true)
                    System.out.println("1");
                else
                    System.out.println("0");
            }else if(method.equals("top")){
                if(stack.empty() == false) {
                    System.out.println(stack.peek());
                }else{
                    System.out.println("-1");
                }
            }
        }
    }
}
