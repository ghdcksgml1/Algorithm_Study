import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{ //버퍼라이터 사용
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();  //몀령어의 개수
		int[] stack = new int[N]; //스택 배열 생성
		int size=0;	//스택원소 번호
		int[] print= new int[N];  //프린트 배열 생성
		int count=0;  //프린트 배열 원소개수
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //명령어 입력
			switch (str) {  //명령어에 따른 case문
			case "push":
				stack[size]=a.nextInt();
				size++;
				break;
			case "pop":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=stack[size-1];
					count++;
					stack[size-1]=0;
					size=size-1;
					break;
				}
			case "size":
				if(size==0) {
					print[count]=0;
					count++;
					break;
				}
				else {
					print[count]=size;
					count++;
					break;
				}
			case "empty":
				if(size==0) {
					print[count]=1;
					count++;
					break;
				}
				else {
					print[count]=0;
					count++;
					break;
				}
			case "top":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=stack[size-1];
					count++;
					break;
				}
				
			}			
			
		}
		for(int i=0;i<count;i++) {  //명령어에 따른 출력값을 프린트배열에 저장
			bw.write(print[i]+"\n");
		}
		
		bw.flush();  //한번에 출력
		a.close();
		
	}

}
