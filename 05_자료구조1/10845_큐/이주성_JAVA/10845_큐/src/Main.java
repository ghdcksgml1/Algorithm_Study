// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 18652 KB , 시간 : 396 ms

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    q.add(x);
                    break;

                case "pop":
                    if (!q.isEmpty()) {
                        bw.write(q.removeFirst()+"\n");
                    } else {
                        bw.write("-1"+"\n");
                    }
                    break;

                case "size":
                    bw.write(q.size()+"\n");
                    break;

                case "empty":
                    if (!q.isEmpty()) {
                        bw.write("0"+"\n");
                    } else {
                        bw.write("1"+"\n");
                    }
                    break;

                case "front":
                    if (!q.isEmpty()) {
                        bw.write(q.getFirst()+"\n");
                    } else {
                        bw.write("-1"+"\n");
                    }
                    break;

                case "back":
                    if (!q.isEmpty()) {
                        bw.write(q.getLast()+"\n");
                    } else {
                        bw.write("-1"+"\n");
                    }
                    break;

                default:
                    break;
            }
        }


        bw.close();
    }
}