// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 16404 KB , 시간 : 248 ms

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    // 에라토스테네스의 체 DP
    public static boolean[] Et_arr = new boolean[1000001];
    public static void Et(){
        for(int i=2;i<=1000000;i++){
            if(Et_arr[i] == true)
                continue;
            for(int j=2;i*j<=1000000;j++)
                Et_arr[i*j]=true;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] N_arr = new String[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<N;i++){
            N_arr[i] = st.nextToken();
        }

        Et(); // 소수 구하기

        Arrays.sort(N_arr); // 중복을 제거하기 위해서 정렬해두기

        BigInteger result = BigInteger.ONE; // 범위 무한대인 BigInteger 사용
        String prev = "";
        for(int i=0;i<N;i++){
            if(N_arr[i].equals(prev)) continue; // 중복이면 넘기기
            prev = N_arr[i];
            // 소수이면, result에 곱해주기
            if(Et_arr[Integer.parseInt(N_arr[i])] == false){
                BigInteger bigNum = new BigInteger(N_arr[i]);
                result = result.multiply(bigNum);
            }
        }

        if(result != BigInteger.ONE){
            System.out.println(result);
        }else{
            System.out.println(-1);
        }
    }
}
