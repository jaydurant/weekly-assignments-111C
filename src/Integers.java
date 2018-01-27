import java.util.*;

public class Integers{
	
	public static void main(String... str){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give first number");
		Integer a = input.nextInt();
		System.out.println("Give second number");
		Integer b = input.nextInt();
		int sum = a+b;
		int product = a * b;
		int difference = a - b;
		int modulus = a % b;
		int fraction = a / b;
		
		System.out.println("Sum: " + sum );
		System.out.println("Product: " + product);
		System.out.println("Diff: " + difference);
		System.out.println("Modulus:" + modulus);
		System.out.println("Fraction:" + fraction);
		
		
	}
}

