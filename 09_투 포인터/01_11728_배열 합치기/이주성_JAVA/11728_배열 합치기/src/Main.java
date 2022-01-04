// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 312052 KB , 시간 : 1708 ms

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] B = new int[M];
        int[] ans = new int[N+M];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int a=0, b=0, c=0;

        // 하나씩 비교해서 작은것부터 넣어주기
        while(a<N && b<M) {
            if (A[a] > B[b]) {
                ans[c++] = B[b++];
            }
            else {
                ans[c++] = A[a++];
            }
        }

        // 한쪽에만 남아있는 경우 그대로 넣어주기
        while(a<N) {
            ans[c++] = A[a++];
        }
        while(b<M) {
            ans[c++] = B[b++];
        }

        for (int i=0; i<ans.length; i++) {
            bw.write(ans[i]+" ");
        }

        bw.close();
    }
}