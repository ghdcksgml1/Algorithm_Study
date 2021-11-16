// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 25896 KB , 시간 : 352 ms

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static int abs(int a){
        if(a<0) a= -a;
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = abs(o1);
                int b = abs(o2);
                if(a>b) {
                    return 1;
                } else if(a<b) {
                    return -1;
                } else {
            // 절댓값이 가장 작은 값이 여러개일 때는, 가장 작은 수를 출력
                    return o1-o2;
                }
            }
        });

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num!=0) {
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