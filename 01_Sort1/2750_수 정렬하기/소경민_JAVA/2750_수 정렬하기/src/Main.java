import java.util.Scanner;
public class Main {
	private static void quickSort(int[] arr) { //재귀함수 호출
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr,int start ,int end) {
		int part2 = partition(arr,start,end);
		if (start<part2-1){ //왼쪽 부분 퀵정렬
			quickSort(arr,start,part2 -1);
		}
		if (part2<end) { //오른쪽 부분 정렬
			quickSort(arr,part2,end);
		}
	}
	private static int partition(int[] arr,int start, int end) { //partition 나누는 함수
		int pivot = arr[(start+end)/2]; //시작과 끝의 중간 값을 기준값으로 설정 
		while (start<=end) { //시작점이 끝점보다 작거나 같을 때만 
			while (arr[start]<pivot) { //시작점의 값이 기준값보다 작으면 시작점이 오른쪽으로 이동
				start++;
			}
			while (arr[end]>pivot) { //끝점의 값이 기준값보다 크면 끝점이 왼쪽으로 이동
				end--;
			}
			if (start <= end) { //시작점과 끝점이 교차되거나 만나지 않았으면 swap
				swap (arr,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	private static void swap(int[] arr,int start, int end) {
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		
		int N =a.nextInt();
		int arr[]= new int[N];
		
		for (int i=0;i<N;i++) {
			arr[i]= a.nextInt();
		}
		
		quickSort(arr);
		
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
		a.close();
	}

}
