// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 19804 KB , 시간 : 248 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String method = st.nextToken();
            if(method.equals("push_front")){
                dq.addFirst(Integer.parseInt(st.nextToken()));
            }else if(method.equals("push_back")){
                dq.addLast(Integer.parseInt(st.nextToken()));
            }else if(method.equals("pop_front")){
                if(dq.isEmpty() == true){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.peekFirst()+"\n");
                    dq.pollFirst();
                }
            }else if(method.equals("pop_back")){
                if(dq.isEmpty() == true){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.peekLast()+"\n");
                    dq.pollLast();
                }
            }else if(method.equals("size")){
                bw.write(dq.size()+"\n");
            }else if(method.equals("empty")){
                if(dq.isEmpty() == true)
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }else if(method.equals("front")){
                if(dq.isEmpty() == true){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.peekFirst()+"\n");
                }
            }else if(method.equals("back")){
                if(dq.isEmpty() == true){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.peekLast()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
