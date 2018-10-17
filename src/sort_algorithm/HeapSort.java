package sort_algorithm;

public class HeapSort {
	public static void main(String[] args) {
//		int[] heap = {3,7,1,8,5,9,2,10,6,4};
		int[] heap = {10,26,5,37,1,61,11,59,15,48,19};
		int len = heap.length;
		int root, current, tmp;
		
		// make max heap from leaf to root
//		for(int i=1;i<len;i++) {
//			current = i;
//			while(current != 0) {
//				root=(current-1)/2; // select parent node of current
//				if(heap[root] < heap[current]) {
//					tmp = heap[root];
//					heap[root] = heap[current];
//					heap[current] = tmp;
//				}
//				current = root;
//			}
//		}
		
		// make max heap from root to leaf
		for(int i=(len-1)/2;i>=0;i--) {
			root = i;
			current = 2*root+1; // select left child node
			while(current<len) {
				if(current < len-1 && heap[current]<heap[current+1]) {
					current++;
				}
				if(heap[root] < heap[current]) {
					tmp = heap[root];
					heap[root] = heap[current];
					heap[current] = tmp;
				}
				root = current;
				current = 2*root+1;
			}
		}

		// change maximum and last value of heap
		// then, sort with max heap from first value to last-1 value of heap
		for(int i=len-1; i>0;i--) {
			tmp = heap[0];
			heap[0] = heap[i];
			heap[i] = tmp;
			
			root = 0;
			current = 1;
			while(current < i){
				current = 2*root+1;
				
				// find child more bigger
				if(current < i-1 && heap[current]<heap[current+1]) {
					current++;
				}
				// change root and current to make max heap
				if(current < i && heap[root]<heap[current]) {
					tmp = heap[root];
					heap[root] = heap[current];
					heap[current] = tmp;
				}
				root = current;

			}
			for(int k=0; k<len;k++)
				System.out.print(heap[k] + " ");
			System.out.println();
		}

		System.out.println();
		for(int i=0; i<len;i++)
			System.out.print(heap[i] + " ");
	}
}
