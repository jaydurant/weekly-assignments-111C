import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		long inputInt = input.nextInt();
		long factorialProduct = 1; 
		
		for(int i = 1; i <= inputInt; i++) {
			factorialProduct *= i;
		}
		
		System.out.println(factorialProduct);
	}

}
