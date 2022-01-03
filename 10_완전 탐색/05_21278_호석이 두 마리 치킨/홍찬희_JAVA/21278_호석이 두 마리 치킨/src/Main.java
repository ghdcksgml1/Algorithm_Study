// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 17704 KB , 시간 : 240	 ms
import java.util.*;
import java.io.*;

public class Main {
    public static final int INF = 0x3f3f3f3f;

    public static int N,M;
    public static ArrayList<pair>[] edges;
    public static int[][] dist;

    // 플로이드와샬
    public static void floydWarshall(){
        for(int i=1;i<=N;i++){
            for(pair p : edges[i]){
                dist[i][p.first] = p.second;
            }
        }

        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(dist[i][j] > dist[i][k] + dist[k][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dist = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                dist[i][j] = INF;
                if(i==j) dist[i][j] = 0;
            }
        }
        edges = new ArrayList[N+1];
        for(int i=0;i<=N;i++){
            edges[i] = new ArrayList<pair>();
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            edges[A].add(new pair(B,1));
            edges[B].add(new pair(A,1));
        }
        floydWarshall();

//        for(int i=1;i<=N;i++){
//            for(int j=1;j<=N;j++){
//                System.out.print(dist[i][j]+" ");
//            }
//            System.out.println();
//        }
        int min = Integer.MAX_VALUE;
        int min_a = 0;
        int min_b = 0;
        for(int i=1;i<=N;i++){
            for(int j=i+1;j<=N;j++){
                int temp = 0;
                for(int k=1;k<=N;k++){
                    if(k==i || k==j) continue;
                    temp += Math.min(dist[i][k],dist[j][k]);
                }
                if(min > temp){
                    min = temp;
                    min_a = i;
                    min_b = j;
                }
            }
        }
        System.out.println(min_a+" "+min_b+" "+min*2);
    }
    static class pair{
        int first;
        int second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
