package stacks;

public class StacksAlgebraExtraCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkBalance("(1+2)+(1-3)"));
		System.out.println(evaluatePostfix("34-5*"));
		System.out.println(convertToPostFix("(1-3)/4"));
	}
	
	public static boolean checkBalance(String expression) {
		boolean isBalanced = true;
		Integer expressionLength = expression.length();
		Integer currentIndex = 0;
		Stack<Character> stack = new Stack<>();

		while(isBalanced && currentIndex < expressionLength) {
			Character currentValue = expression.charAt(currentIndex);
			switch(currentValue) {
				case '(':
				case '{':
				case '[':
					stack.push(currentValue);
					break;
				case ')':
				case '}':
				case ']':
					if(stack.isEmpty()) {
						isBalanced = false;
					}else {
						isBalanced = isPaired(stack.pop(),currentValue);
					}
					break;
			}
			
			currentIndex++;
		}
		if(!stack.isEmpty()) {
			isBalanced = false;
		}
		return isBalanced;
		
	}
	
	public static boolean isPaired(char open,char close) {
		return (open == '{' && close == '}') || 
				(open == '(' && close == ')') || 
				(open == '[' && close == ']');
	}
	
	public static double evaluatePostfix(String expression) {
		Stack<Double> valueStack = new Stack<>();
		Integer currentIndex = 0;
		Integer exprLen = expression.length();
		
		while(currentIndex < exprLen) {
			Character nextValue = expression.charAt(currentIndex);
			Double result = null;
			switch(nextValue) {
				case '+':
				case '-':
				case '*':
				case '/':
				case '^':
					Double operand2= valueStack.pop();
					Double operand1 = valueStack.pop();
					result = evaluateResult(operand1,operand2,nextValue);
					valueStack.push(result);
					break;
				default:
					Double currentValue = (double)nextValue - '0';
					valueStack.push(currentValue);
					break;
			}
			
			currentIndex++;			
		}
		
		return valueStack.peek();
	}
	
	public static double evaluateResult(Double op1, Double op2, Character operand ) {
		Double result = 0.0 ;
		switch(operand) {
			case '-':
				result  = op1 - op2;
				break;
			case '+':
				result = op1 + op2;
				break;
			case '*':
				result = op1 * op2;
				break;
			case '/':
				result = op1 / op2;
				break;
			case '^':
				result = Math.pow(op1, op2);
				break;
		}
		return result;
	}
	
	public static String convertToPostFix(String expression) {
		Integer index = 0;
		Integer lenOfExpression = expression.length();
		String postfix = "";
		Stack<Character> stackOps = new Stack<>();
		
		while(index < lenOfExpression) {
			Character nextItem = expression.charAt(index);
			switch(nextItem) {
				case '^':
					stackOps.push(nextItem);
					break;
				case '+':
				case '-':
				case '*':
				case '/':
					stackOps.push(nextItem);
					break;
				case '(':
					stackOps.push(nextItem);
					break;
				case ')':
					Character topOp = stackOps.pop();
					while(topOp != '(') {
						postfix += topOp;
						topOp = stackOps.pop();
					}
					break;
				default:
					postfix += nextItem;
					break;
			}
			index++;
		}
		
		while(!stackOps.isEmpty()) {
			Character topOp = stackOps.pop();
			if(topOp == '^' || topOp == '+' || topOp == '-' || topOp == '*' || topOp == '/') {
				postfix += topOp;
				topOp = stackOps.pop();
			}
		}
		
		return postfix;
	}

}
