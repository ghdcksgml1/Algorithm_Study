// 언어 : JAVA , (성공/실패) : 1/0 
// 메모리 : 16548 KB , 시간 : 148 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[][] cost_customer;
    public static int[] dp = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        cost_customer = new int[20][2];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            cost_customer[i][0] = Integer.parseInt(st.nextToken());
            cost_customer[i][1] = Integer.parseInt(st.nextToken());
        }

        bw.write(choice(C, N)+" ");

        bw.close();
    }

    public static int choice(int C, int N) {
        int min = Integer.MAX_VALUE;
        int cost;

        if(C <= 0) return 0;

        else if (dp[C] > 0) return dp[C];

        else {
            for(int i=0; i<N; i++) {
                cost = choice(C-cost_customer[i][1], N) + cost_customer[i][0];
                min = Math.min(cost, min);
            }
            dp[C] = min;

            return min;
        }
    }
}