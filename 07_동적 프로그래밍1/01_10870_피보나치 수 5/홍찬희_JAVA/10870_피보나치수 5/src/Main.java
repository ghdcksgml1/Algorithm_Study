// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14160 KB , 시간 : 124 ms
import java.io.*;

public class Main {
    public static int[] dp = new int[21];
    public static int fibonacci(int x){
        if(x==0) return 0;
        if(x==1) return 1;
        if(x==2) return 1;
        if(dp[x]!=0) return dp[x];
        return fibonacci(x-1)+fibonacci(x-2);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }
}
