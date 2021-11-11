// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 15416 KB , 시간 : 156 ms

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // for문 안에 해야함.. 이거때매 계속 틀림.. 젠장..
            Stack<String> s = new Stack<String>();

            // VPS인지 아닌지
            boolean isVPS = true;
            String[] str = br.readLine().split("");

            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("(")) {
                    s.push("(");
                } else if (str[j].equals(")")){
                    if (!s.isEmpty()) {
                        s.pop();
                    } else {
                        isVPS = false;
                        break;
                    }
                }
            }

            if (!s.isEmpty()) {
                isVPS = false;
            }

            if (isVPS) {
                bw.write("YES"+"\n");
            } else {
                bw.write("NO"+"\n");
            }
        }


        bw.close();
    }
}