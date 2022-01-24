import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i=0;i<N;i++) {
			arr[i][0]=a.nextInt();
			arr[i][1]=a.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				if(a1[1] == a2[1]) {
					return a1[0] - a2[0];
				}
				else {
					return a1[1]-a2[1];
				}
			}
		});
		
		for (int i=0;i<N;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
		a.close();

	}

}
