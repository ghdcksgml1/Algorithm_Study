// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 16056 KB , 시간 : 384ms

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int T = Integer.parseInt(st.nextToken());

        for(int i=0;i<T;i++){
            str = br.readLine();
            st = new StringTokenizer(str," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int Copy_A = A,Copy_B = B;
            int index = 2;
            int result = 1;
            int MAX = Math.max(A,B);
            while(index <= MAX){
                if(Copy_A%index == 0 && Copy_B%index == 0){
                    Copy_A /= index;
                    Copy_B /= index;
                    result *= index;
                    index = 2;
                }else{
                    index += 1;
                }
            }
            System.out.println(Copy_A*Copy_B*result);
        }

    }
}
