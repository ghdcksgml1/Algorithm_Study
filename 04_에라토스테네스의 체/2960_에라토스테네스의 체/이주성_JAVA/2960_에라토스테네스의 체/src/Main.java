// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 15732 KB , 시간 : 140 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[] PrimeNum(int N){
            boolean prime[] = new boolean[N+1];
            int[] prime_num = new int[N+1];
            int[] remove_order = new int[N+1];
            int index = 1;

            // 0과 1인 소수가 아니니까 지우기
            prime[0] = prime[1] = true;

            for(int i=2; i<=N; i++) {
                // i가 소수라면
                if(!prime[i]) {
                    remove_order[index] = i;
                    index++;
                    // N보다 작은 i의 배수 지우기
                    for(int j=i*i; j<=N; j+=i) {
                        if (!prime[j]) {
                            prime[j] = true;
                            remove_order[index] = j;
                            index++;
                        }

                    }
                }
            }

//            for(int i=1; i<=N; i++) {
//                if (!prime[i]) {
//                    prime_num[index] = i;
//                    index++;
//                }
//            }
//
//            return prime_num;
        return remove_order;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] remove_order = PrimeNum(N);

//        for (int i=1; i<=N; i++) {
//            bw.write(remove_order[i]+" ");
//        }
//
//        bw.write("\n");

        bw.write(remove_order[M]+" ");

        bw.close();
    }
}