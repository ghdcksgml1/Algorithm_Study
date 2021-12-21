// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 224160 KB , 시간 : 876 ms
import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX = 1001;
    public static int T,N,K,W;
    public static int[] D = new int[MAX];

    public static int[] arr = new int[MAX];
    public static int[] result = new int[MAX];
    public static ArrayList<ArrayList<Integer>> v = new ArrayList<>();

    // 위상정렬
    public static void topologySort(){
        ArrayList<Integer> q = new ArrayList<>();

        for(int i=1;i<=N;i++){
            if(arr[i] == 0){
                q.add(i);
                result[i] = D[i];
            }
        }

        while(!q.isEmpty()){
            int cur = q.get(0);
            q.remove(0);

            for(int j=0;j<v.get(cur).size();j++){
                int next = v.get(cur).get(j);
                result[next] = Math.max(result[next],result[cur]+D[next]);
                arr[next] -= 1;
                if (arr[next] == 0) {
                    q.add(next);
                }
            }
        }

        System.out.println(result[W]);
    }

    public static void reset(){
        for(int i=0;i<=N;i++){
            arr[i]=0;
            result[i]=0;
            D[i]=0;
            v.get(i).clear();
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            for(int i=0;i<=N;i++){
                v.add(new ArrayList<>());
            }

            st = new StringTokenizer(br.readLine()," ");
            for(int i=1;i<=N;i++){
                D[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0;i<K;i++){
                int X,Y;
                st = new StringTokenizer(br.readLine()," ");
                X = Integer.parseInt(st.nextToken());
                Y = Integer.parseInt(st.nextToken());

                v.get(X).add(Y);
                arr[Y]++;
            }
            W = Integer.parseInt(br.readLine());

            if(arr[W] != 0)
                topologySort();
            else
                System.out.println(D[W]);
            reset();
        }
    }
}
