// 언어 : JAVA , (성공/실패) : 1/2 , 메모리 : 24788 KB , 시간 : 420 ms

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int N = Integer.parseInt(str);
        String[] N_arr = new String[N];

        for(int i=0;i<N;i++){
            N_arr[i] = br.readLine();
        }

        Arrays.sort(N_arr, new Comparator<String>() {
            // String은 비교하는 방법이 살짝 다르다. compareTo로 비교
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length() - o2.length();
                }
            }
        });

        // 중복되지 않은 값만 출력하는 코드
        String prev = "";
        for(int i=0;i<N;i++){
            if(!prev.equals(N_arr[i])) {
                bw.write(N_arr[i] + "\n");
            }
            prev = N_arr[i];
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
