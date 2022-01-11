// 언어 : JAVA , (성공/실패) : 1/5
// 메모리 : 28664 KB , 시간 : 372 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int K_cnt = 0;
        int R_cnt =0;

        // 최대 길이 (답)
        int result=0;

        // 먼저 R의 개수를 구해서 최대 길이 초기화해주기
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'R') {
                R_cnt++;
            }
            if (s.charAt(i) == 'K') {
                K_cnt++;
            }
        }
        result = R_cnt;

        // R이 없으면 0출력
        if (R_cnt == 0) {
            bw.write("0"+" ");
            bw.close();
            return;
        }

        // K가 없으면 R의 개수가 답
        if (K_cnt == 0) {
            bw.write(R_cnt+" ");
            bw.close();
            return;
        }

        // R을 만날때까지 왼쪽, 오른쪽 투 포인터로 출발
        int l = -1;
        int r = s.length();

        int l_K = 0;
        int r_K = 0;

        int temp_left_R = 0;
        int temp_right_R = 0;


        while(true) {
            if(l>=r) break;
            // 왼쪽 K의 개수가 오른쪽 K의 개수보다 작거나 같으면
            if(l_K <= r_K) {
                // 왼쪽부터 포인터++
                l++;

                // 옮긴 포인터의 문자열이 K일 경우
                if (s.charAt(l) == 'K'){
                    // 왼쪽 K 개수 ++
                    l_K++;

                    // 만약 이전에 R 문자열이었다면
                    if(l>0 && s.charAt(l-1) == 'R') {
                        // 임시로 세어뒀던 R의 개수 빼주기
                        R_cnt -= temp_left_R;

                        // 임시 R 카운터 초기화
                        temp_left_R = 0;
                    }
                }
                // 옮긴 포인터의 문자열이 R일 경우
                else {
                    // R 개수 임시로 세어두기
                    temp_left_R++;
                }
            }
            // 오른쪽 K의 개수 > 왼쪽 K의 개수
            else {
                // 오른쪽부터 포인터--
                r--;

                // 옮긴 포인터의 문자열이 K인 경우
                if (s.charAt(r) == 'K') {
                    // 오른쪽 K 개수 ++
                    r_K++;

                    // 만약 이전에 R 문자열이었다면
                    if (r < (s.length() - 1) && s.charAt(r + 1) == 'R') {
                        // 임시로 세어뒀던 R의 개수 빼주기
                        R_cnt -= temp_right_R;

                        // 임시 R 카운터 초기화
                        temp_right_R = 0;
                    }
                }
                // 옮긴 포인터의 문자열이 R일 경우
                else{
                    // R 개수 임시로 세어두기
                    temp_right_R++;
                }
            }

            // R이 없어지는 순간 break
            if (R_cnt <= 0) {
                break;
            }

            // 양쪽 K의 개수가 작은 쪽의 K 개수 선택
            if(l_K<r_K) {
                result = Math.max(result, R_cnt + l_K*2);
            } else {
                result = Math.max(result, R_cnt + r_K*2);
            }
        }

        bw.write(result+" ");

        bw.close();
    }
}