import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] nums;

    static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            n2 = upper_bound(n2);
            n1 = lower_bound(n1);

            bw.write(n2-n1+"\n");

        }
    }

    static int lower_bound(int num) throws IOException {
        int L = 1;
        int R = N;
        int ans = R + 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (nums[mid] >= num) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return ans;
    }

    static int upper_bound(int num) throws IOException {
        int L = 1;
        int R = N;
        int ans = R + 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (nums[mid] > num) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        init();

        bw.close();
    }
}