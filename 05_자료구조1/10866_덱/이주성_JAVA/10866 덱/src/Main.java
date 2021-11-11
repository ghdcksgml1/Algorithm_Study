// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 19812 KB , 시간 : 248 ms

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(dq.isEmpty()){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(dq.removeFirst()+"\n");
                    }
                    break;
                case "pop_back":
                    if(dq.isEmpty()){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(dq.removeLast()+"\n");
                    }
                    break;
                case "size":
                    bw.write(dq.size()+"\n");
                    break;
                case "empty":
                    if(dq.isEmpty()){
                        bw.write("1"+"\n");
                    } else {
                        bw.write("0"+"\n");
                    }
                    break;
                case "front":
                    if(dq.isEmpty()){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(dq.getFirst()+"\n");
                    }
                    break;
                case "back":
                    if(dq.isEmpty()){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(dq.getLast()+"\n");
                    }
                    break;
                default:
                    break;

            }

        }

        bw.close();
    }
}