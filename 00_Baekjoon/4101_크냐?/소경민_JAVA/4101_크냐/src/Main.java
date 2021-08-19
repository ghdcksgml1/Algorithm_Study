import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		
		for (int i;;) {
			
			int A = a.nextInt();
			int B = a.nextInt();
			
			if (A>B){
				System.out.println("Yes");
			
			}
			else if (A==0&&B==0) {
				break;
			}
			else {
				System.out.println("No");
			}
		}
		a.close();		

	}

}
