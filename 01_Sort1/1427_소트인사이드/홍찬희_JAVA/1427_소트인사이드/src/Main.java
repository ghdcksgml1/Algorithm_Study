// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14260 KB , 시간 : 144ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int[] num = new int[10];

        while(N>0){
            num[N%10] += 1;
            N /= 10;
        }

        for(int i=9;i>=0;i--){
            if(num[i]>0){
                for(int j=0;j<num[i];j++){
                    System.out.print(i);
                }
            }
        }

        br.close();
    }
}
