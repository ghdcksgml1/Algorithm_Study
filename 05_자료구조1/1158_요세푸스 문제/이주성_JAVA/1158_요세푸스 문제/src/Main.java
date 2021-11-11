// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 296272 KB , 시간 : 568 ms

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> arr = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            arr.add(i);
        }

        bw.write("<");
        while(arr.size() != 1){
            for(int j=1; j<K; j++) {
                arr.add(arr.remove());
            }
            bw.write(arr.remove()+", ");

        }

        bw.write(arr.remove()+">");

        bw.close();
    }
}