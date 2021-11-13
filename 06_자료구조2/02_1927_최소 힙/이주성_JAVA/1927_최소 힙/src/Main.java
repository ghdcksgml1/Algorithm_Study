// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 26620 KB , 시간 : 364 ms

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num>0) {
                pq.add(num);
            } else {
                if(pq.isEmpty()) {
                    bw.write("0"+"\n");
                } else {
                    bw.write(pq.poll()+"\n");
                }
            }
        }



        bw.close();
    }
}