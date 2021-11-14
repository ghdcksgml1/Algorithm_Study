// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 37848 KB , 시간 : 548 ms

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());

            if(minheap.size() == maxheap.size()) {
                maxheap.add(num);
            } else {
                minheap.add(num);
            }

            if (!minheap.isEmpty() && !maxheap.isEmpty()) {
                if (maxheap.peek() > minheap.peek()) {
                    int temp = maxheap.poll();
                    maxheap.add(minheap.poll());
                    minheap.add(temp);
                }

            }
            bw.write(maxheap.peek()+"\n");
        }


        bw.close();
    }
}