import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int M = a.nextInt(); //최솟값
		int N = a.nextInt(); //최댓값
		
		int[] visit = new int[N+1]; //방문배열 생성
		
		for(int i=2;i<N+1;i++) {  //가장 큰 값 아래의 모든 소수들 찾기
			for(int j=1;i*j<=N;j++) {
					visit[i*j]++;
			}
		}
		int count=0;
		for(int i=M;i<N+1;i++) { //최솟값 부터 최댓값사이의 소수 개수 찾기
			if(visit[i]==1) {
				count++;
			}
		}
		int[] prime_number = new int[count]; //소수개수 크기 만큼의 배열 생성
		int k=0;
		for(int i=M;i<N+1;i++) { //
			if(visit[i]==1) {
				prime_number[k]=i;
				k++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(prime_number[i]);
		}
		a.close();
	}

}
