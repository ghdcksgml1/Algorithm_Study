import java.util.*;
public class Main {

	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in)) {
			int N = a.nextInt(); //최댓값
			int K = a.nextInt(); //K번째 지워지는 수
			int count=0;
			
			boolean[] visit = new boolean[N+1]; //방문배열 생성
			
			for(int i=2;i<N+1;i++) { //소수 찾기
				for(int j=1;i*j<=N;j++) {
					if(visit[i*j]==false) { //방문안한 곳은 false 지워지는 수를 true  
						visit[i*j]=true;
						count++;
					} 
					if(count==K) { //count를 세면서 K번째 지워지는 수를 출력
						System.out.println(i*j);
						return ;
					}
				}
			}
			a.close();
		}

	}

}
