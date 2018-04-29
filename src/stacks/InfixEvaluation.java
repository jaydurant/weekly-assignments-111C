package stacks;

public class InfixEvaluation {

	public static void main(String[] args) {
		System.out.println(evaluateInfix("4*3+7"));
	}
	
	public static Double evaluateInfix(String expression) {
		Stack<Character> operatorStack = new Stack<>();
		Stack<Double> valueStack = new Stack<>();
		Integer charCount = 0;
		
		while(charCount < expression.length()) {
			Character nextCharacter = expression.charAt(charCount);
			
			switch(nextCharacter) {
				case '^':
					operatorStack.push(nextCharacter);
					break;
				case '+':
				case '-':
				case '*':
				case '/':
					while(!operatorStack.isEmpty() && evaluatePrecedence(nextCharacter, operatorStack.peek()) ) {
						Character topOperator = operatorStack.pop();
						Double operand2 = valueStack.pop();
						Double operand1 = valueStack.pop();
						Double resultCurrent = evaluateExpression(operand1, operand2, topOperator);
						valueStack.push(resultCurrent);
					}
					operatorStack.push(nextCharacter);
					break;
				case '(':
					operatorStack.push(nextCharacter);
					break;
				case ')':
					Character topOperator = operatorStack.pop();
					while(topOperator != '(') {
						Double operand2 = valueStack.pop();
						Double operand1 = valueStack.pop();
						Double resultCurrent = evaluateExpression(operand1, operand2, topOperator);
						valueStack.push(resultCurrent);
						topOperator = operatorStack.pop();
					}
					break;
				default:
					Double value = (double) (nextCharacter - '0');
					valueStack.push(value);
					break;
			}
			charCount++;
		}
		
		while(!operatorStack.isEmpty()) {
			Character topOperator = operatorStack.pop();
			Double operand2 = valueStack.pop();
			Double operand1 = valueStack.pop();
			Double resultCurrent = evaluateExpression(operand1, operand2, topOperator);
			valueStack.push(resultCurrent);
		}
		
		return valueStack.pop();
	}
	
	public static Double evaluateExpression(Double one, Double two,Character operator) {
		Double result = 0.0;
		switch(operator) {
			case '+':
				result = one + two;
				 break;
			case '-':
				result = one - two;
				break;
			case '*':
				result = one * two;
				break;
			case '/':
				result = one / two;
				break;
			case '^':
				result = Math.pow(one, two);
				break;
		}
		return result;
	}
	
	public static boolean evaluatePrecedence(Character next, Character current) {
		boolean  result = false;
		if(current == '^' && (next == '+' || next == '-' || next == '*' || next == '/' )) {
			result = true;
		} 
		
		else if( (current == '/' || current == '*' ) && (next == '+' || next == '-')) {
			result = true;
		}
		
		return result;
	}

}
