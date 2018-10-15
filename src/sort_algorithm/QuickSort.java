package sort_algorithm;

public class QuickSort {

	public static void main(String[] args) {
//		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		int[] arr = {3,7,8,1,5,9,6,10,2,4};
		
		quickSort(arr,0,arr.length-1);
		
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left >= right )  // end when left is bigger or same than right
			return;
		int pivot = left;
		int i = left+1, j = right;
		int tmp;
		
		while(i < j) { // i, j 가 엇갈릴 때까지 반복
			while(i<=right && arr[i] <= arr[pivot]) { // i의 값이 pivot보다 클때까지
				i++;
			}
			while(j>=left+1 && arr[j] > arr[pivot]) { // j의 값이 pivot보다 작을때까지
				j--;
			}
			if(i > j) { // i, j가 엇갈리면 pivot과 j를 교체
				tmp = arr[pivot];
				arr[pivot] = arr[j];
				arr[j] = tmp;
			}else { // i, j의 값을 서로 바꿈
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}

}
