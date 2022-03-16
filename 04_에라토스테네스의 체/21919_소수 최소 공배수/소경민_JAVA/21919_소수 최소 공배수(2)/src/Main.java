import java.util.*;
public class Main {
	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in)) {
			int N = a.nextInt();
			int [] arr = new int[N];
			int max = 1; 
			for(int i=0;i<N;i++) { //수열 생성
				arr[i]=a.nextInt();
			}
			for(int i=0;i<N;i++) { //수열에서 가장 큰 값 찾기 
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			
			int[] visit = new int[max+1]; //방문배열 생성
			
			for(int i=2;i<max+1;i++) {  //가장 큰 값 아래의 소수들 찾기
				for(int j=1;i*j<=max;j++) {
						visit[i*j]++;
				}
			}
			int count=0;
			for(int i=2;i<max+1;i++) {
				if(visit[i]==1) {
					for(int j=0;j<N;j++) { //arr배열에서 소수 개수 찾기
						if(arr[j]==i) {
							count++;
							break;
						}
					}
				}
			}
			int[] prime_number = new int[count]; //소수개수만큼의 소수배열 생성
			int k=0;
			for(int i=2;i<max+1;i++) { 
				if(visit[i]==1) {
					for(int j=0;j<N;j++) {
						if(arr[j]==i) {
							prime_number[k]=i;
							k++;
							break;
						}
					}
				}
			}
			if(k==0) { //소수가 없는 경우
				System.out.println("-1");
			}
			else if(k==1) { //소수가 한 개인 경우
				System.out.println(prime_number[0]);
			}
			else { //나머지 경우
				int Mul=1;
			
				for(int i=0;i<count;i++) {
					Mul=Mul*prime_number[i];
					}
				System.out.println(Mul);
				}
			a.close();
		}

	}

}