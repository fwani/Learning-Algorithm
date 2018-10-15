package sort_algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		int tmp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}

}
