package data_structure;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(4);
		stack.push(5);
		stack.push(2);
		stack.push(6);
		stack.push(8);
		stack.push(9);
		stack.stackPrinter();

		System.out.println("pop : "+stack.pop());	
		System.out.println("pop : "+stack.pop());
		stack.stackPrinter();
		
		System.out.println("peek : "+stack.peek());
		stack.stackPrinter();
		
		Queue queue = new Queue();
		queue.add(1);
		queue.add(4);
		queue.add(5);
		queue.add(2);
		queue.add(6);
		queue.add(8);
		queue.add(9);
		queue.queuePrinter();

		System.out.println("poll : "+queue.poll());
		System.out.println("poll : "+queue.poll());
		queue.queuePrinter();

		System.out.println("peek : "+queue.peek());
		queue.queuePrinter();
	}

}
