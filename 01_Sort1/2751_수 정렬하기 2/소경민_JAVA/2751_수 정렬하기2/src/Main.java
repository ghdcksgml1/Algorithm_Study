import java.util.Scanner;
public class Main {
	
	private static void mergeSort(int[] arr) { //병합정렬 재귀함수 호출
		int temp[] = new int[arr.length];
		mergeSort(arr,temp,0,arr.length-1);
	}
	private static void mergeSort(int[] arr,int[] temp,int start,int end) {
		if (start<end) { 
			int mid = (start+end)/2;
			mergeSort(arr,temp,start,mid); //중간을 기준으로 나누어서 앞쪽 병합정렬
			mergeSort(arr,temp,mid+1,end); //중간을 기준으로 나누어서 뒤쪽 병합정렬
			merge(arr,temp,start,mid,end); //병합 함수를 통해 두 부분을 병합			
		}
	}
	private static void merge(int[] arr,int[] temp, int start,int mid,int end) {
		for (int i =start;i<=end;i++) {
			temp[i]=arr[i];
		}
		int part1 = start; //앞쪽 시작점
		int part2 = mid+1; //뒤쪽 시작점
		int index = start;
		while (part1 <= mid && part2 <= end) { //양쪽이 모두 끝까지 갈 때 까지 반복
			if (temp[part1] <= temp[part2]) { //앞쪽이 작으면 앞쪽의 시작점을 임시공간에 저장한 후 한칸뒤로 이동
				arr[index] = temp[part1];
				part1++;
			}
			else { //뒤쪽이 작으면 뒤쪽의 시작점을 임시공간에 저장한 후 한칸뒤로 이동
				arr[index] = temp[part2];
				part2++;
			}
			index++; //임시공간에 저장되면 1 증가
		}
		for (int i=0;i <= mid-part1;i++) { //앞쪽에 값이 남아있으면 임시공간의 뒤에 붙이기
			arr[index+i] = temp[part1+i];
		}
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		int arr[]= new int[N];
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=a.nextInt();
		}
		
		mergeSort(arr);
		
		for(int data : arr) {
			System.out.println(data);
		}
		
		a.close();
	}

}
