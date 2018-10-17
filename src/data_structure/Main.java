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
	}

}
