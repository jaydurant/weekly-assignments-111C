package stacks;

public class StackOrder {

	public static void main(String[] args) {
		Stack<Integer> stackOriginal = new Stack<>();
		stackOriginal.push(1);
		stackOriginal.push(2);
		stackOriginal.push(3);
		stackOriginal.push(4);

		displayStack(stackOriginal);
	}
	
	public static void displayStack(Stack<Integer> stack) {
		Stack<Integer> stackOrder = new Stack<>();
		
		while(!stack.isEmpty()) {
			stackOrder.push(stack.pop());
		}
		
		while(!stackOrder.isEmpty()) {
			Integer value = stackOrder.pop();
			System.out.println(value);
			stack.push(value);
		}
	}
	
	

}
