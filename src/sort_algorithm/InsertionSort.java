package sort_algorithm;

public class InsertionSort {
	public static void main(String[] args) {
		//  이전 데이터는 정렬이 되어있다고 생각하고 진행
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
//		int[] arr = {2,3,4,5,6,7,8,9,10,1};
		int tmp;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}else break; // 이 전의 데이터는 자신보다 작기때문에 비교를 멈춤
			}
		}
		
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
}
