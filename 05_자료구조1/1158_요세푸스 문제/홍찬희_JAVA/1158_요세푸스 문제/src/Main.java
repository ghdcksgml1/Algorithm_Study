// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 296260 KB , 시간 : 600 ms

// StringBuilder, ArrayList를 이용하는 방법도 있음
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=N;i++){
            queue.add(i);
        }

        bw.write("<");
        while(queue.isEmpty() == false){
            for(int i=0;i<K-1;i++){
                queue.add(queue.peek());
                queue.remove();
            }
            if(queue.size() == 1){
                bw.write(queue.peek()+">");
                break;
            }
            bw.write(queue.peek()+", ");
            queue.remove();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
