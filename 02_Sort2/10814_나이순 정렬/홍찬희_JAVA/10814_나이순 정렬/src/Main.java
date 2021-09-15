// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 48532 KB , 시간 : 852 ms

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Person[] p = new Person[N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = new Person(Integer.parseInt(st.nextToken()),st.nextToken());
        }
        
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        for(int i=0;i<N;i++){
            bw.write(p[i].age + " " + p[i].name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 나이와 이름을 담는 클래스
    public static class Person{
        int age;
        String name;

        Person(int age,String name){
            this.age = age;
            this.name = name;
        }
    }
}
