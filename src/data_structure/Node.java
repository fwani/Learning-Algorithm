package data_structure;

public class Node {
	private int val;
	private Node next;

	Node(){
		this.val = -1;
		this.next = null;
	}
	Node(int val){
		this.val = val;
		this.next = null;
	}

	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
