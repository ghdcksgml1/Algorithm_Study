import java.util.*;
import java.io.*;

class Point{
    public int x;
    public int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Point[] point = new Point[N];
        int[][] dp = new int[N+1][K+1];
        int max = 0;

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            point[i] = new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=K;j++){
                if(point[i-1].x <= j)
                    dp[i][j] = Math.max(point[i-1].y+dp[i-1][j-point[i-1].x],dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
                max = Math.max(dp[i][j],max);
            }
        }
        System.out.println(max);
    }
}
