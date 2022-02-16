import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=a.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[N-1];
		for(int i=N-2;i>=0;i--) {
			max=Math.max(max,arr[i]*(N-i));
		}
		
		System.out.println(max);
		a.close();

	}

}
