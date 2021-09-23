// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 15048 KB , 시간 : 156 ms

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            boolean trigger = false;
            Stack<String> stack = new Stack<>();
            String[] str = br.readLine().split("");

            for(int j=0;j<str.length;j++){
                if(str[j].equals("("))
                    stack.push("(");
                if(str[j].equals(")")){
                    if(stack.empty() == true){
                        trigger = true;
                        break;
                    }
                    stack.pop();
                }
            }

            if(trigger == false && stack.empty() == true)
                System.out.println("YES");
            if(trigger == true || stack.empty() == false)
                System.out.println("NO");
        }
    }
}
