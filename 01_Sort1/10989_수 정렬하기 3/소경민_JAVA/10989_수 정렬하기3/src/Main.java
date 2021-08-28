import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int N = Integer.parseInt(a.nextLine());
		int arr[]= new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=a.nextInt();
		}
		
		Arrays.sort(arr); //sortÇÔ¼ö
		
		for(int data : arr) {
			System.out.println(data);
		}
		a.close();
	}

}
