package stacks;

public class StackStringDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("car");
		stack.push("door");
		stack.push("man");
		stack.push("bird");
		
		System.out.println("First pop " + stack.pop() );
		System.out.println("Current top " + stack.peek());
		
		if(!stack.isEmpty()) {
			stack.clear();
		}
		
		System.out.println(stack.peek());
		
	}
	
}
