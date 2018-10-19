package search_algorithm;

import java.util.Vector;

public class DepthFirstSearch {
	// 깊이를 먼저 탐색하는 서치 알고리즘이다.
	// stack을 사용해서 구현 할 수 있다. 
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
		
		dfs(1);
//		for(int i=0; i< a.size(); i++)
//			for(int j=0; j<a.get(i).length; j++)
//				System.out.print(a.get(i)[j]+" ");
//			System.out.println();
	}
	public static void dfs(int x) {
		if(check[x-1]) return;
		check[x-1] = true;

		System.out.print(x+" ");
		for(int i=0; i<a.get(x-1).length;i++) {
			int y = a.get(x-1)[i];
			dfs(y);
		}
	}
}
