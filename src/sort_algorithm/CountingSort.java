package sort_algorithm;

public class CountingSort {
	// counting sort(계수정렬)
	// 범위가 정해져있을 때 단순히 개수를 세어서 출력을 값만큼 반복하면 됨.
	public static void main(String[] args) {
		int arr[] = {
				1,3,2,4,3,2,5,3,1,2,
				3,4,4,3,5,1,2,3,5,2,
				3,1,4,3,5,1,2,1,1,1			
		};
		int count[] = new int[5];
		
		// initialize count to zero
		for(int i=0;i<count.length;i++) {
			count[i] = 0;
		}
		// counting
		for(int i=0;i<arr.length;i++) {
			count[arr[i]-1]++;
		}
		//print
		for(int i=0;i<count.length;i++) {
			for(int j=0;j<count[i];j++) {
				System.out.print(i+1+" ");
			}
		}
	}
}
