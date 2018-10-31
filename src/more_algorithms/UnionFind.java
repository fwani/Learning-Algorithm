package more_algorithms;

public class UnionFind {

	public static void main(String[] args) {
		int parent[] = new int[11];
		for(int i=1; i < parent.length; i++) {
			parent[i] = i;
		}
		unionParent(parent, 1, 2);
		unionParent(parent, 2, 3);
		unionParent(parent, 3, 4);
		
		unionParent(parent, 5, 6);
		unionParent(parent, 6, 7);
		unionParent(parent, 7, 8);
		
		System.out.println("1 and 5 is connected? "+findParent(parent, 1, 5));
		
		unionParent(parent, 1, 6);
		System.out.println("1 and 5 is connected? "+findParent(parent, 1, 5));
	}
	// find parent node
	public static int getParent(int parent[], int x) {
		if (parent[x] == x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	// union parent node
	public static void unionParent(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a<b) parent[b] = a;
		else parent[a] = b;
	}
	// check they has same parent
	public static boolean findParent(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a==b) return true;
		else return false;
	}
}
