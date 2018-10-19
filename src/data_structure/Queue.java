package data_structure;

public class Queue {
	private Node front;
	private Node rear;
	int size;
	
	Queue(){
		this.front = rear;
		this.rear = null;
		this.size = 0;
	}
	public void add(int val) {
		Node newNode = new Node(val);
		if(this.size == 0) {
			this.front = newNode;
			this.rear = newNode;
			this.size++;
		}else {
			this.rear.setNext(newNode);
			this.rear = newNode;
			this.size++;
		}
	}
	public int peek() {
		if(isEmpty()) return -1;
		return this.front.getVal();
		
	}
	public int poll() {
		if(isEmpty()) return -1;
		int delVal = peek();
		this.front = this.front.getNext();
		if(this.size==1)
			this.rear = null;
		this.size--;
		return delVal;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	public void queuePrinter() {
		Node pointer = this.front;
		System.out.print("front");
		while(pointer != null) {
			System.out.print(" -> "+pointer.getVal());
			pointer = pointer.getNext();
		}
		System.out.println(" -> rear");
	}
}
