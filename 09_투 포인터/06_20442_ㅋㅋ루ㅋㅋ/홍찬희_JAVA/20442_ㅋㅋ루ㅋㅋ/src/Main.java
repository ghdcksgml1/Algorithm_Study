// 언어 : JAVA , (성공/실패) : 1/6 , 메모리 : 28244 KB , 시간 : 336 ms
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int R = 0; int K = 0;
        int max_cnt = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'R') R++;
            if(str.charAt(i) == 'K') K++;

        }
        // R == 0 이면 ㅋㅋ루ㅋㅋ가 없다.
        if(R == 0){
            System.out.println("0");
            return;
        }
        // K == 0 이면 R의 개수가 ㅋㅋ루ㅋㅋ의 개수이다.
        if(K == 0){
            System.out.println(R);
            return;
        }
        max_cnt = R; // 처음 최댓값은 R의 개수로 설정해둔다.

        int first_pointer = -1; int left_K_cnt = 0; int left_R_temp_cnt = 0;
        int second_pointer = str.length(); int right_K_cnt = 0; int right_R_temp_cnt = 0;
        while(true){
            if(first_pointer >= second_pointer ) break;

            // 왼쪽 K의 개수가 오른쪽 K의 개수보다 작거나 같다면
            if(left_K_cnt <= right_K_cnt) {
                first_pointer++;
                // 문자열이 K일 경우에
                if (str.charAt(first_pointer) == 'K') {
                    left_K_cnt++; // K의 개수를 증가시킨다.
                    // 중요!! 만약 R이 이전 인덱스에 있었는데 K가 이번에 나왔다면 이전에 연속으로 나왔던 R의 개수만큼 빼준다.
                    // ex.) 지금까지 탐색한 문자열이 KRRK 이면 R을 2개 빼준다. KRK 이면 R을 1개빼준다.
                    // ex.) KRKKRK 이면 R을 1개빼준다. 이유: KRK에서 R은 이미 한번빼줘서 다시 빼줄필요가 없기때문에
                    if (first_pointer > 0 && str.charAt(first_pointer - 1) == 'R') {
                        R -= left_R_temp_cnt; // 연속된 R의 개수만큼 빼주고
                        left_R_temp_cnt = 0; // R의 임시 개수를 0으로 바꿔준다.
                    }
                } else { // R이 나오면 임시 개수 변수에 1을 더한다.
                    left_R_temp_cnt++;
                }
            }else { // 오른쪽 K의 개수가 왼쪽보다 적다면
                second_pointer--;
                if (str.charAt(second_pointer) == 'K') {
                    right_K_cnt++;
                    if (second_pointer < (str.length() - 1) && str.charAt(second_pointer + 1) == 'R') {
                        R -= right_R_temp_cnt;
                        right_R_temp_cnt = 0;
                    }
                } else {
                    right_R_temp_cnt++;
                }
            }

            // R이 0이면 ㅋㅋ루ㅋㅋ는 없는것이므로 종료
            if(R <= 0) break;

            // K의 개수가 작은쪽의 K개수만큼 양옆에 배치할 수 있으므로 아래와같이 식을 표현한다.
            int temp_k = (left_K_cnt>right_K_cnt?right_K_cnt:left_K_cnt)*2;
            max_cnt = Math.max(max_cnt,R+temp_k);
        }

        System.out.println(max_cnt);
    }
}
// KRKKRKRRRKKKRKK 11

// KKKRKRRKRKRKRKRKK 12

// KKKKKKKKKKRKK 5

// KKRKRKKKKKKK 7

// KKKRRKRKRK 8

// KKKKKKKRKRKK 7