package more_algorithms;

public class BinaryTree {
	public static void main(String[] args) {
		int number = 15;
		Node nodes[] = new Node[number];
		for(int i = 0; i < number; i++) {
			nodes[i] = new Node(i+1);
		}
		for(int i = 1; i < number; i++) {
			if(i%2!=0) {
				nodes[i/2].leftChild = nodes[i];
			}
			else {
				nodes[i/2-1].rightChild = nodes[i];
			}
		}
//		for(int i = 0; i <number; i++) {
//			System.out.println(nodes[i].data);
//		}
		preorder(nodes[0]);
		System.out.println();
		inorder(nodes[0]);
		System.out.println();
		postorder(nodes[0]);
		System.out.println();
	}
	// node
	static class Node{
		int data;
		Node leftChild, rightChild;
		Node(int data){
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	// preorder traversal
	static void preorder(Node node) {
		if(node != null) {
			System.out.print(node.data + " ");
			preorder(node.leftChild);
			preorder(node.rightChild);
		}
	}
	// inorder traversal
	static void inorder(Node node) {
		if(node != null) {
			inorder(node.leftChild);
			System.out.print(node.data + " ");
			inorder(node.rightChild);
		}
	}
	
	// postorder traversal
	static void postorder(Node node) {
		if(node != null) {
			postorder(node.leftChild);
			postorder(node.rightChild);
			System.out.print(node.data + " ");
		}
	}
	
	
}
