import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int N =a.nextInt();
		
		String number = String.valueOf(N);
		
		String[] digits = number.split(""); //split함수로 숫자를 자릿값 마다 자르기
		
		Arrays.sort(digits,Collections.reverseOrder());
		
		for (int i=0;i<digits.length;i++) {
			System.out.print(digits[i]);
			
		}
		a.close();

	}

}
