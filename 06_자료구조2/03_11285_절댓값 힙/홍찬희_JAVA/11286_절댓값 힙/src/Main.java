// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 26392 KB , 시간 : 388 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 아이디어
        // + 값은 plus 우선순위 큐에 최소힙으로 만들고
        // - 값은 minus 우선순위 큐에 최대힙으로 만든다.
        // 절댓값이 작은 것을 출력할때, 두 개의 우선순위큐에서 최상단을 뽑는다.
        // minus가 작거나 같으면 무조건 작으므로 minus 최상단을 출력하고 pop하고
        // plus가 작으면 plus 최상단을 출력하고 pop한다.
        PriorityQueue<Integer> plus = new PriorityQueue<>();
        PriorityQueue<Integer> minus = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num < 0){
                minus.add(num);
            }else if(num > 0){
                plus.add(num);
            }else{
                try {
                    if(Math.abs(minus.peek()) <= plus.peek()){
                        bw.write(minus.peek()+"\n");
                        minus.poll();
                    }else{
                        bw.write(plus.peek()+"\n");
                        plus.poll();
                    }
                }catch(Exception e){
                    if(minus.isEmpty() && plus.isEmpty()){
                        bw.write("0\n");
                    }else if(minus.isEmpty()){
                        bw.write(plus.peek()+"\n");
                        plus.poll();
                    }else{
                        bw.write(minus.peek()+"\n");
                        minus.poll();
                    }
                }

            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
