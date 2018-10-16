package sort_algorithm;

public class HeapSort {
	public static void main(String[] args) {
		int[] heap = {3,7,1,8,5,9,2,10,6,4};
		int len = heap.length;
		int root, current, tmp;
		
		// make max heap
		for(int i=1;i<len;i++) {
			current = i;
			while(current != 0) {
				root=(current-1)/2;
				if(heap[root] < heap[current]) {
					tmp = heap[root];
					heap[root] = heap[current];
					heap[current] = tmp;
				}
				current = root;
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
		}

		for(int i=0; i<len;i++)
			System.out.print(heap[i] + " ");
	}
}
