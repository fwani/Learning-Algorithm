package data_structure;

public class Stack {
	private Node top;
	
	Stack(){
		top = null;
	}
	
	public void push(int val) {
		Node newNode = new Node(val);
		newNode.setNext(top);
		top = newNode;
	}
	
	public int peek() {
		if(isEmpty()) return -1;
		return top.getVal();
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		int delVal = peek();
		top = top.getNext();
		return delVal;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void stackPrinter() {
		Node pointer = top;
		System.out.print("top");
		while(pointer != null) {
			System.out.print(" -> "+pointer.getVal());
			pointer = pointer.getNext();
		}
		System.out.println();
	}
}
