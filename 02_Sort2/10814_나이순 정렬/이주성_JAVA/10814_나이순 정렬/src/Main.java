// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 57180 KB , 시간 : 904 ms

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static void memberSort(String[][] member, int N) {
        Arrays.sort(member, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].equals(o2[0])) {
                    return 0;
                } else {
                    int A = Integer.parseInt(o1[0]);
                    int B = Integer.parseInt(o2[0]);
                    return A - B;
                }

            }
        });

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

//        int[] age = new int[N];
//        String[] name = new String[N];
//
//        for (int i=0; i<N; i++) {
//            s= br.readLine();
//            StringTokenizer st = new StringTokenizer(s," ");
//            age[i] = Integer.parseInt(st.nextToken());
//            name[i] = st.nextToken();
//        }
//
//        for (int i=0; i<N; i++) {
//            bw.write(age[i]+" "+name[i]+"\n");
//        }

        String[][] member = new String[N][2];
        for (int i=0; i<N; i++) {
            s= br.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            member[i][0] = st.nextToken();
            member[i][1] = st.nextToken();
        }

        memberSort(member, N);

        for (int i=0; i<N; i++) {
            bw.write(member[i][0]+" "+member[i][1]+"\n");
        }

        bw.close();
    }
}
