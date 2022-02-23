// 언어 : JAVA , (성공/실패) : 1/0 ,
// 메모리 : 27160 KB , 시간 : 352 ms

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] nums, selected;
    static LinkedHashSet<String> LHset = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        input();
        
        String numString = "";
        Arrays.sort(nums);

        rec_func(1, 0, numString);

        Iterator<String> iter = LHset.iterator();
        while (iter.hasNext()) {
            bw.write(iter.next()+"\n");
        }

        bw.close();
    }

    static void rec_func(int k, int prev, String numString) throws IOException {
        if (k == M + 1) {
            LHset.add(numString);
        } else {
            for (int i = prev + 1; i <= N; i++) {
                int n = nums[i];

                selected[k] = n;
                rec_func(k + 1, i, numString + n + " ");
                selected[k] = 0;
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N + 1];
        selected = new int[M + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
    }
}
