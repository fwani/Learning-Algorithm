package sort_algorithm;

public class MergeSort {
	static int[] sorted;
	public static void main(String[] args) {
//		int[] arr = {3,7,1,8,5,9,2,10,6,4};
		int[] arr = {7,6,5,8,3,5,9,1};
		sorted = new int[arr.length];
		
		mergeSort(arr,0,arr.length-1);
		
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}

	public static void mergeSort(int[] arr,int start, int end) {
		if(start >= end) 
			return;
		
		int mid = (start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
	}
	public static void merge(int[] arr, int start, int mid, int end) {
		int i=start, j=mid+1;
		int index = start;
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j])
				sorted[index++]=arr[i++];
			else
				sorted[index++]=arr[j++];
		}
		while(i<=mid)
			sorted[index++]=arr[i++];
		while(j<=end)
			sorted[index++]=arr[j++];
		
		for(int k=start;k<=end;k++) {
			arr[k] = sorted[k];
		}
	}
}
