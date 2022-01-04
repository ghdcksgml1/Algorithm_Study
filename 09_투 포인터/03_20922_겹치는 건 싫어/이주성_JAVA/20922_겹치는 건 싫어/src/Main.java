// 언어 : JAVA , (성공/실패) : 1/0
// 메모리 : 34552 KB , 시간 : 376 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        int r = 0;
        int ans = 0;

        int[] cnt = new int[100001];

        while(r<N) {
            // 중복되는 수가 K이하일 때까지 r 최대한 늘려주기
            while(r<N && cnt[arr[r]]+1 <= K) {
                cnt[arr[r]]++;
                r++;
            }
            // 다 늘려준 후 길이 갱신
            ans = Math.max(ans, r-l);
            // l 포인터 값 개수 빼주고 늘려주기
            cnt[arr[l]]--;
            l++;
        }


        bw.write(ans+" ");

        bw.close();
    }
}