// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 26936 KB , 시간 : 212 ms

import java.io.*;
import java.util.ArrayList;

public class Main {
    // 에라토스테네스의 체
    public static boolean[] Et_arr = new boolean[4000001];
    public static void Et(int n){
        for(int i=2;i*i<=n;i++){
            if(Et_arr[i] == true) continue;
            for(int j=2;i*j<=n;j++){
                Et_arr[i*j] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Et_arr[0]=true;Et_arr[1]=true;
        Et(N);

        ArrayList<Integer> primeNum = new ArrayList<>();
        for(int i=0;i<=N;i++){
            if(Et_arr[i]==false){
                primeNum.add(i);
            }
        }

        // 투 포인터
        // end부터 쭉더해서 같거나 클때까지 더한다.
        // 더한 값이 N보다 크면, 맨앞쪽 수를 하나 뺀다.
        // 그 뒤, 인덱스를 하나 증가(start)시킨다.
        int sum = 0;
        int cnt = 0;
        int start=0;int end=0;
        while(true){
            // sum이 N보다 크거나 같다면,
            // start 인덱스의 소수를 빼준다.
            if(sum>=N){
                sum -= primeNum.get(start);
                start++;
            }
            // end가 끝에 도달하면, while문을 종료한다.
            else if(end == primeNum.size()) break;
            // sum이 N보다 작다면,
            // end 인덱스의 소수를 더해준다.
            else{
                sum += primeNum.get(end);
                end++;
            }
            // 더하거나 빼진 sum의 값이 N과 같다면,
            // cnt++ 해준다.
            if(sum == N) cnt++;
        }

        System.out.println(cnt);
    }
}
