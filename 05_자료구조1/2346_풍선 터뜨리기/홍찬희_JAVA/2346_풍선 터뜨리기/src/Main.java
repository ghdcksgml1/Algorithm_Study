// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 16528	 KB , 시간 : 220 ms

import java.io.*;
import java.util.*;

class Point{
    int x;
    int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Point> dq = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<N;i++){
            dq.add(new Point(i+1,Integer.parseInt(st.nextToken())));
        }

        while(true) {
            int cnt = dq.peekFirst().y;
            bw.write(dq.peekFirst().x + " ");
            dq.pollFirst();
            if(dq.isEmpty() == true) break;
            if(cnt>0){
                for(int i=0;i<cnt-1;i++){
                    dq.add(dq.peekFirst());
                    dq.pollFirst();
                }
            }else{
                for(int i=0;i<Math.abs(cnt);i++){
                    dq.addFirst(dq.peekLast());
                    dq.pollLast();
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
