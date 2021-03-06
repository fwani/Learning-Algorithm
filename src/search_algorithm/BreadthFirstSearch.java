package search_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BreadthFirstSearch {
	// 너비를 먼저 탐색하는 서치 알고리즘이다. 최단 경로를 찾아주는 것이다.
	// queue를 이용해서 구현 할 수 있다.
	static Vector<int[]> a = new Vector<>();
	static boolean check[] = new boolean[7];
	public static void main(String[] args) {
		// 1 connect to 2,3
		a.add(new int[]{2,3});
		// 2 connect to 1,3,4,5
		a.add(new int[]{1,3,4,5});
		// 3 connect to 1,2,6,7
		a.add(new int[] {1,2,6,7});
		// 4 connect to 2,5
		a.add(new int[]{2,5});
		// 5 connect to 2,4
		a.add(new int[]{2,4});
		// 6 connect to 3,7
		a.add(new int[]{3,7});
		// 7 connect to 3,6
		a.add(new int[]{3,6});
		
		bfs(1);
//		for(int i=0; i< a.size(); i++)
//			for(int j=0; j<a.get(i).length; j++)
//				System.out.print(a.get(i)[j]+" ");
//			System.out.println();
	}
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		check[start-1] = true;
		while(!que.isEmpty()) {
			int x = que.poll();
			System.out.print(x+" ");
			for(int i=0; i<a.get(x-1).length;i++) {
				int y = a.get(x-1)[i];
				if(!check[y-1]) {
					que.add(y);
					check[y-1] = true;
				}
			}
		}
	}

}
