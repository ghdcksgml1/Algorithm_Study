// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 18672 KB , 시간 : 252 ms

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int lastNum = -1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String method = st.nextToken();
            if(method.equals("push")){
                int temp = Integer.parseInt(st.nextToken());
                queue.add(temp);
                lastNum = temp;
            }else if(method.equals("pop")){
                if(queue.isEmpty() == false) {
                    bw.write(queue.peek()+"\n");
                    queue.remove();
                }else
                    bw.write("-1"+"\n");
            }else if(method.equals("size")){
                bw.write(queue.size()+"\n");
            }else if(method.equals("empty")){
                if(queue.isEmpty() == true){
                    bw.write("1"+"\n");
                }else{
                    bw.write("0"+"\n");
                }
            }else if(method.equals("front")){
                if(queue.isEmpty() == false) {
                    bw.write(queue.peek()+"\n");
                }else
                    bw.write("-1"+"\n");
            }else if(method.equals("back")){
                if(queue.isEmpty() == false) {
                    bw.write(lastNum+"\n");
                }else
                    bw.write("-1"+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
