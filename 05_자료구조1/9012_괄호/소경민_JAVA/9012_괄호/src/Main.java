import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int T = a.nextInt(); //입력 데이터의 수
		String[] str = new String[T]; //문자열 배열 생성
		
		for(int i=0;i<T;i++) {
			str[i]=a.next();
		}
		
		int size=0;
		
		for(int i=0;i<T;i++) {
			String[] stack = new String[str[i].length()];  //문자열의 길이 만큼의 스택 생성
			String[] arr = str[i].split("");  //입력받은 문자열을 한글자씩 나눔
			
			loop:  //for루프 이름
			for(int j=0;j<str[i].length();j++) {
				switch(arr[j]) {  //switch문 사용
				case "(":         //입력받은 괄호가 '('이면 스택에 쌓는데 만약 마지막으로 들어온 괄호가 '('라면 NO를 출력
					stack[size]=arr[j];
					size++;
					if(j==str[i].length()-1) {
						System.out.println("NO");
						break loop;
					}
					break;
				case ")":        //입력받은 괄호가 ')'인 경우 스택이 비어있으면 NO를 출력하고 아니면 스택에 있는 '('하나를 지우는데 스택이 비어있고 더이상의 입력 받은 괄호가 없다면 YES를 출력 아니면 NO를 출력 
					if(stack[0]==null) {
						System.out.println("NO");
						break loop;
					}
					stack[size-1]=null;
					size=size-1;
					if(stack[0]==null && j==str[i].length()-1) {
						System.out.println("YES");
						break loop;
					}
					else if(stack[0]!=null && j==str[i].length()-1) {
						System.out.println("NO");
						break loop;
					}
					break;
				}
			}
			size=0;  //size초기화
		 }
		a.close();

	}

}
