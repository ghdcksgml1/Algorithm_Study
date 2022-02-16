import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int M = a.nextInt();
		int N = a.nextInt();
		int count=0;   //소수의 개수
		for(int i=M;i<=N;i++) { //M과N사이 소수개수
			int x=0;
			if(i==2) {
				count++;
			}
			else {
				for(int j=2;j<i;j++) {
					if(i%j!=0) { 
						x++;
						if(x==i-2) {
							count++;
						}
					}
				}
			}
		}
		
		int[] prime_number = new int[count]; //소수들의 배열
		int k=0;	   //소수 배열의 자리번호
		
		for(int i=M;i<=N;i++) { //소수찾고 배열
			int x=0;
			if(i==2) {
				prime_number[k]=i;
				k++;
			}
			else {
				for(int j=2;j<i;j++) {
					if(i%j!=0) { 
						x++;
						if(x==i-2) {
							prime_number[k]=i;
							k++;
						}
					}
					
				}
			}
		}
		int sum=0;     //소수들의 합 
		
		for(int j=0;j<count;j++) { //소수들의 합구하기
			sum=prime_number[j]+sum;
		}
		
		if(count==0) {
			System.out.println(-1);
		}
		else{
			System.out.println(sum);
			System.out.println(prime_number[0]);
		}
		a.close();
	}
}
