import java.util.*;

public class Main {
	public static String[] remove_Duplicate_Elements(String arr1[], int n){  
		if (n==0 || n==1){  
            return arr1;  
        }
		else {
			String[] tempA = new String[n];  
			int j = 0;  
			for (int i=0; i<n-1; i++){  
				if (!arr1[i].equals(arr1[i+1])){  
					tempA[j++] = arr1[i];}  
			}  
			tempA[j++] = arr1[n-1]; 
			for (int i=0; i<j; i++){  
				arr1[i] = tempA[i];  
				}  
			return arr1;
        }  
    }

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		String[] arr = new String[N];
		
		a.nextLine();
		
		for(int i=0;i<N;i++) {
			arr[i]=a.nextLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a1,String a2) {
				if(a1.length() == a2.length()) {
					return a1.compareTo(a2);
				}
				else {
					return a1.length() - a2.length();
				}
			}
		});
		
	    String[] arr1 = remove_Duplicate_Elements(arr, N); //중복원소 제거
	    for (int i=0; i<arr1.length; i++) {  
	       System.out.println(arr1[i]);
	    }
	    a.close();
	}

}
