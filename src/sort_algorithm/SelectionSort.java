package sort_algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		int min, tmp;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
}
