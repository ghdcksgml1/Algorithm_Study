import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		int K = a.nextInt();
		
		
		int[] queue = new int[N*K]; //ť �迭 ����
		int push_index = -1;  //ť���� Ǫ���� ���� ��ȣ
		int pop_index = 0;    //ť���� ���� ���� ��ȣ
		int count=0;		 //����Ʈ �迭 ���� ����
		int print[] = new int[N];
		
		
		
		
		for(int i=0;i<N;i++) {
			push_index++;
			queue[push_index]=i+1;
		}
		
		while(count!=N) {    //����Ʈ �迭�� ���Ұ����� N���� �ɶ����� �ݺ�
			for (int i =0; i<K*N;i=pop_index) {
				for(int j=0;j<K-1;j++) {       //K-1���� ���Ҿ� �迭�� �ڷ� Ǫ��
					push_index++;
					queue[push_index]=queue[i+j];
				
				}
				pop_index=i+K-1;     //K��° ���Ҵ� ���ؼ� ����Ʈ�迭�� ����
				print[count]=queue[pop_index];
				count++;			//count����
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
