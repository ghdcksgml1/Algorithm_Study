// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14244 KB , 시간 : 128 ms

import java.util.*;
import java.io.*;

class Infor{
    public int charge;
    public int member;

    public Infor(int charge,int member){
        this.charge = charge;
        this.member = member;
    }

    @Override
    public String toString() {
        return "Infor{" +
                "charge=" + charge +
                ", member=" + member +
                '}';
    }
}

public class Main {
    public static int[] dp = new int[2000];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Infor[] infors = new Infor[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            infors[i] = new Infor(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }

        int temp;
        for(int i=0;i<=C;i++){
            for(int j=0;j<N;j++){
                temp = i + infors[j].member; // 멤버 더한 것

                // dp가 0이면, dp[temp] 업데이트
                if(dp[i] == 0 && i!=0) continue;
                if(dp[temp] == 0){ dp[temp] = dp[i]+infors[j].charge;}
                // 그렇지 않으면, dp[temp]가 비용을 더한 것보다 클때 작은거 업데이트
                else{
                    dp[temp] = Math.min(dp[temp],dp[i]+infors[j].charge);
                }
            }
        }

        int min= Integer.MAX_VALUE;
        for(int i=C;i<=C+100;i++){
            if(dp[i] == 0) continue;
            min = Math.min(min, dp[i]);
        }
        System.out.println(min);
    }
}
