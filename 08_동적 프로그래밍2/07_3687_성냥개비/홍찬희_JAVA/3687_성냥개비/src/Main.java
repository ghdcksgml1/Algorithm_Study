// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 39276 KB , 시간 : 428 ms
import java.math.BigInteger;
import java.io.*;

public class Main{
    public static String[] mathstick = {"0","0","1","7","4","2","0","8"};
    public static BigInteger min(BigInteger a,BigInteger b){
        int result = a.compareTo(b);
        if(result > 0) return b; // a가 크다.
        else return a; // b가 크다.
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int n = Integer.parseInt(br.readLine());
            String[] dp = new String[n+100];
            dp[2]="1";dp[3]="7";dp[4]="4";dp[5]="2";dp[6]="6";dp[7]="8";

            for(int i=2;i<=7;i++){
                for(int j=0;j<=n;j++){
                    if(dp[j] == null) continue;
                    int temp = j+i;
                    if(dp[temp] == null){
                        if(dp[j] == null)
                            dp[temp] = mathstick[i];
                        else
                            dp[temp] = dp[j] + mathstick[i];
                    }else{
                        String x;
                        if(dp[j] == null)
                            x = mathstick[i];
                        else
                            x = dp[j] + mathstick[i];
                        BigInteger a = new BigInteger(dp[temp]);
                        BigInteger b = new BigInteger(x);
                        dp[temp] = min(a,b).toString();
                    }
                }
            }

            System.out.print(dp[n]+" ");

            if(n%2 == 0){
                for(int i=0;i<n/2;i++){
                    System.out.print("1");
                }
            }else{
                n -= 3;
                System.out.print("7");
                for(int i=0;i<n/2;i++){
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
