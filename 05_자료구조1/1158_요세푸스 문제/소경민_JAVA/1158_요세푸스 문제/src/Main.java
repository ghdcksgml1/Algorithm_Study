import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		int K = a.nextInt();
		
		
		int[] queue = new int[N*K]; //큐 배열 생성
		int push_index = -1;  //큐에서 푸쉬할 원소 번호
		int pop_index = 0;    //큐에서 팝할 원소 번호
		int count=0;		 //프린트 배열 원소 개수
		int print[] = new int[N];
		
		
		
		
		for(int i=0;i<N;i++) {
			push_index++;
			queue[push_index]=i+1;
		}
		
		while(count!=N) {    //프린트 배열의 원소개수가 N개가 될때까지 반복
			for (int i =0; i<K*N;i=pop_index) {
				for(int j=0;j<K-1;j++) {       //K-1개의 원소씩 배열의 뒤로 푸쉬
					push_index++;
					queue[push_index]=queue[i+j];
				
				}
				pop_index=i+K-1;     //K번째 원소는 팝해서 프린트배열에 대입
				print[count]=queue[pop_index];
				count++;			//count증가
				pop_index++; 
				
			}
		
		}
		System.out.print("<");
		if(count==1) {
			System.out.print(print[0]);	
		}
		else {
			for(int i =0;i<N;i++) {
		
				if(i==N-1) {
					System.out.print(" "+print[i]);
				}
				else if(i==0) {
					System.out.print(print[i]+",");
				}
				else {
					System.out.print(" "+print[i]+',');
				}
			}
		}
		System.out.print(">");
		
		
		
		
		
		
		
		a.close();

	}

}
