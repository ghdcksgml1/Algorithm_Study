import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		int [] arr = new int[N];	//arr배열 생성
		int count=0;
		for(int i=0;i<N;i++) {	//수열 입력
			arr[i]=a.nextInt();
		}
		
		for(int j=0;j<N;j++) {	//2를 제외한 모든 자연수중에 2부터 arr배열의 자기 자신값 전 까지 모든 수로 나머지가 생긴수와 나눠준 수들의 개수가 같다면 소수이다.
			int x =0;
			if(arr[j]==2) {
				count++;
			}
			for(int i =2;i<arr[j];i++) {	//소수 개수 찾기
				if(arr[j]%i!=0) {
					x++;
					if(x==arr[j]-2) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
		a.close();
	}

}
