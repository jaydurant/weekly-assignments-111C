import java.util.*;

public class RecusionFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		displayFactorial(input.nextInt());
	}
	
	public static void displayFactorial(int i) {
		if(i == 1) {
			System.out.println(i);
		}else {
			System.out.println(factorial(i));
		}
	}
	
	public static int factorial(int i) {
		if(i == 1) {
			return 1;
		}else {
			return i * factorial(i - 1);
		}
	}
}
