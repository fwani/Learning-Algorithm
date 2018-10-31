package more_algorithms;

import java.util.Arrays;
import java.util.LinkedList;

public class KruskalAlgorithm {
	// 가장 적은 비용으로 모든 노드를 연결하기 위해서 사용하는 알고리즘.
	// edge가 작은 것을 연결하는 것인데 cicle을 형성 하지 않도록 한다.
	public static void main(String[] args) {
		int numNode = 7;
		int numEdge = 11;
		
		Edge elist[] = new Edge[numEdge];
		elist[0] = new Edge(1, 7, 12);
		elist[1] = new Edge(1, 4, 28);
		elist[2] = new Edge(1, 2, 67);
		elist[3] = new Edge(1, 5, 17);
		elist[4] = new Edge(2, 4, 24);
		elist[5] = new Edge(2, 5, 62);
		elist[6] = new Edge(3, 5, 20);
		elist[7] = new Edge(3, 6, 37);
		elist[8] = new Edge(4, 7, 13);
		elist[9] = new Edge(5, 6, 45);
		elist[10] = new Edge(5, 7, 73);
		
		Arrays.sort(elist);
		
		// 각 정점이 포함된 그래프가 어디인지 저장
		int parent[] = new int[numNode];
		for(int i=0;i<numNode;i++) {
			parent[i] = i;
		}
		int sum = 0;
		for(int i=0; i<elist.length; i++) {
			// 싸이클이 발생하지 않는 경우 그래프에 포함
			if(!findParent(parent, elist[i].node[0] - 1, elist[i].node[1] - 1)) {
				sum += elist[i].distance;
				unionParent(parent, elist[i].node[0] - 1, elist[i].node[1] - 1);
			}
		}
		System.out.println(sum);

	}
	// edge class
	static class Edge implements Comparable<Edge>{
		int node[] = new int[2];
		int distance;
		Edge(int a, int b, int distance){
			this.node[0] = a;
			this.node[1] = b;
			this.distance = distance;
		}
		@Override
		public int compareTo(Edge arg0) {
			// TODO Auto-generated method stub
			return Integer.compare(this.distance, arg0.distance);
		}
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
