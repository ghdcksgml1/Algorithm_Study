import java.io.IOException;
import java.util.*;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;	
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();  //몀령어의 개수
		int[] Deque = new int[2*N+1]; //덱 배열 생성
		int front_index = N;  //덱에서 앞을 의미하는 원소 번호(덱 배열의 중간에서 시작)
		int back_index = N;    //덱에서 뒤를 의미하는 원소 번호(덱 배열의 중간에서 시작)
		int size=0;			//덱의 원소 개수
		int[] print = new int[N];  //프린트 배열 생성
		int count=0;  	//프린트 배열 원소개수
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //명령어 입력
			switch (str) {  //명령어에 따른 case문
			case "push_front":
				if(size==0) {
					Deque[front_index]=a.nextInt();
					size++;
				}
				else {
					front_index--;
					Deque[front_index]=a.nextInt();
					size++;
				}
				break;
			case "push_back":
				if(size==0) {
					Deque[front_index]=a.nextInt();
					size++;
				}
				else{
					back_index++;
					Deque[back_index]=a.nextInt();
					size++;
				}
				break;
			case "pop_front":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=Deque[front_index];
					Deque[front_index]=0;
					count++;
					size--;
					if(back_index==front_index) {
						break;
					}
					else {
						front_index++;
						break;
					}
				}
			case "pop_back":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=Deque[back_index];
					Deque[back_index]=0;
					count++;
					size--;
					if(back_index==front_index) {
						break;
					}
					else {
						back_index--;
						break;
					}
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
					print[count]=Deque[front_index];
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
					print[count]=Deque[back_index];
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
