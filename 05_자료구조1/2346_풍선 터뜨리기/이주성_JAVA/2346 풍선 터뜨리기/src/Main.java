// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 16144 KB , 시간 : 208 ms

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // LinkedList로 정의할 경우 메모리 초과가 발생한다.
        // Deque<int[]> dq = new LinkedList<>();

        // 순차적인 데이터 추가, 삭제 시 ArrayList가 더 효율적
        Deque<int[]> dq = new ArrayDeque<>();

        int next = Integer.parseInt(st.nextToken());
        bw.write("1"+" ");

        for(int i=2; i<=N; i++) {
            dq.add(new int[] {i, Integer.parseInt(st.nextToken())});
        }

        while(!dq.isEmpty()){
            // 0보다 작을 경우
            // |next|-1개 만큼 뒤에서 앞으로 옮기고
            // 맨 뒤에꺼를 터뜨린다.
            if(next<0) {
                for(int j=1; j<-next; j++) {
                    dq.addFirst(dq.removeLast());
                }
                int[] next_arr = dq.removeLast();
                next = next_arr[1];
                bw.write(next_arr[0]+" ");
            // 0보다 작을 경우
            // |next|-1개 만큼 앞에서 뒤로 옯기고
            // 맨 앞에꺼를 터뜨린다.
            } else {
                for(int j=1; j<next; j++) {
                    dq.add(dq.remove());
                }
                int[] next_arr = dq.removeFirst();
                next = next_arr[1];
                bw.write(next_arr[0]+" ");
            }
        }



        bw.close();
    }
}