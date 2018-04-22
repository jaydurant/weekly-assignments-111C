package stacks;



public class StackEmployeeDemo {

	public static void main(String[] args) {
		Stack<EmployeeData> stack  = new Stack<>();	
		
		stack.push(new EmployeeData(1,"jason","manager",500F));
		stack.push(new EmployeeData(2,"jack","dancer",1000F));
		stack.push(new EmployeeData(3,"jack","employee",5000F));
		stack.push(new EmployeeData(4,"ryan","super manager",10000F));
		
		System.out.println("First pop " + stack.pop() );
		System.out.println("Current top " + stack.peek());
		
		if(!stack.isEmpty()) {
			stack.clear();
		}
		
		System.out.println(stack.peek());
	}

}
