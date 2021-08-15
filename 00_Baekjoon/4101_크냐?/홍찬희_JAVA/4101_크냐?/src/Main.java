// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 14308 KB , 시간 : 148ms

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Num_1,Num_2;
        while(true){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");

            Num_1 = Integer.parseInt(st.nextToken());
            Num_2 = Integer.parseInt(st.nextToken());

            if(Num_1==0 && Num_2==0){
                break;
            }

            if(Num_1 > Num_2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
