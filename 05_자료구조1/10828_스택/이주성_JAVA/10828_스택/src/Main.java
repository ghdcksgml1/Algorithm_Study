// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 17836 KB , 시간 : 228 ms


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<Integer>();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String Command = st.nextToken();

            switch (Command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    s.push(x);
                    break;

                case "pop":
                    if (s.empty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(s.peek()+"\n");
                        s.pop();
                    }
                    break;

                case "size":
                    bw.write(s.size()+"\n");
                    break;

                case "empty":
                    if (s.empty()) {
                        bw.write(1+"\n");
                    } else {
                        bw.write(0+"\n");
                    }
                    break;

                case "top":
                    if (s.empty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(s.peek()+"\n");
                    }
                    break;

                default:
                    break;

            }

        }




        bw.close();
    }
}
