import java.util.Queue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedWriter;	
import java.io.IOException;	
import java.io.OutputStreamWriter;	
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner a = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = a.nextInt();  //몀령어의 개수
		int[] print = new int[N];  //프린트 배열 생성
		int count=0;  //프린트 배열 원소개수
		
		int tail = 0; //큐의 마지막값
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //명령어 입력
			switch (str) {  //명령어에 따른 case문
			case "push":
				int x=a.nextInt();
				queue.add(x);
				tail=x;
				break;
			case "pop":
				if(queue.isEmpty()) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue.poll();
					count++;
					break;
				}
			case "size":
				if(queue.isEmpty()) {
					print[count]=0;
					count++;
					break;
				}
				else {
					print[count]=queue.size();
					count++;
					break;
				}
			case "empty":
				if(queue.isEmpty()) {
					print[count]=1;
					count++;
					break;
				}
				else {
					print[count]=0;
					count++;
					break;
				}
			case "front":
				if(queue.isEmpty()) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue.peek();
					count++;
					break;
				}
			case "back":
				if(queue.isEmpty()) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=tail;
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
