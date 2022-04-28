import java.io.BufferedWriter;	
import java.io.IOException;	
import java.io.OutputStreamWriter;	
import java.util.*;	
public class Main {		
	
	public static void main(String[] args) throws IOException{
		
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();  //몀령어의 개수
		int[] queue = new int[N]; //큐 배열 생성
		int push_index = -1;  //큐에서 푸쉬할 원소 번호
		int pop_index = 0;    //큐에서 팝할 원소 번호
		int size=0;	//큐원소 번호
		int[] print = new int[N];  //프린트 배열 생성
		int count=0;  //프린트 배열 원소개수
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //명령어 입력
			switch (str) {  //명령어에 따른 case문
			case "push":
				push_index++;
				queue[push_index]=a.nextInt();
				size++;
				break;
			case "pop":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue[pop_index];
					queue[pop_index]=0;
					count++;
					pop_index++;
					size=push_index-pop_index+1;
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
			case "front":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue[pop_index];
					count++;
					break;
				}
			case "back":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue[push_index];
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
