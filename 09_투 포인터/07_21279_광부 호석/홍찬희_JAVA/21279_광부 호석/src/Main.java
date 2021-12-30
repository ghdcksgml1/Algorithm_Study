import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        ArrayList<pair>[] xx = new ArrayList[100001]; // x기준 y좌표와 value값
        ArrayList<pair>[] yy = new ArrayList[100001]; // y기준 x좌표와 value값
        // ArrayList 초기화
        for(int i=0;i<100001;i++){
            xx[i] = new ArrayList<pair>();
            yy[i] = new ArrayList<pair>();
        }
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            long x,y,v;
            x = Long.parseLong(st.nextToken());
            y = Long.parseLong(st.nextToken());
            v = Long.parseLong(st.nextToken());
            xx[(int)x].add(new pair(y,v));
            yy[(int)y].add(new pair(x,v));
        }
        long max = 0; // 최댓값
        long value = 0; // 현재까지의 가치
        int cnt = 0; // 현재 개수
        int x_pointer = 0; // x 포인터
        int y_pointer = 100000; // y 포인터

        while(x_pointer <= 100000){
            for(int i=0;i<xx[x_pointer].size();i++){
                // 같은 x좌표에 있지만, y좌표가 y_pointer보다 큰 경우에는 넘긴다.
                if(xx[x_pointer].get(i).first > y_pointer) continue;
                value += xx[x_pointer].get(i).second; // value 추가
                cnt++;
            }
            // 가진 돈을 초과했을 경우
            while(cnt > C){
                // y_pointer를 줄여가며 값이 나
                for(int i=0;i<yy[y_pointer].size();i++){
                    // 같은 y좌표에 있지만, x좌표가 x_pointer보다 큰 경우에는 넘긴다.
                    if(yy[y_pointer].get(i).first > x_pointer) continue;
                    value -= yy[y_pointer].get(i).second; // value 추가
                    cnt--;
                }
                y_pointer--;
            }
            x_pointer++;
            if(max < value) max = value;
        }
        System.out.println(max);
    }
    static class pair{
        public long first,second;
        pair(long first,long second){
            this.first = first;
            this.second = second;
        }
        pair(){
            this.first = 0;
            this.second = 0;
        }
    }
}
