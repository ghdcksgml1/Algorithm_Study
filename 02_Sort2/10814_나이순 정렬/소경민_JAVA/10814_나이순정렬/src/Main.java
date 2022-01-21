import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		String[][] arr = new String[N][2];
		
		for(int i=0;i<arr.length;i++) {
			arr[i][0]=a.next();
			arr[i][1]=a.next();
		
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] a1,String[] a2) {
				return Integer.parseInt(a1[0])-Integer.parseInt(a2[0]);
			}
		});
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
		a.close();
	}
}
