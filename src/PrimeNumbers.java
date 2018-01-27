import java.util.*;
public class PrimeNumbers {
	private static String PRIME = "PRIME";
	private static String COMP = "Composite";
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number");
		Integer inputInt = input.nextInt();
		
		
		if(inputInt > 1){
			for(int i = 2; i < inputInt; i++) {
				if(inputInt % i == 0){
					System.out.println(inputInt + " is " + COMP);
					return;
				}
			}
			System.out.println(inputInt + " is " + PRIME);
		} else {
			System.out.println(inputInt + " is " + COMP);
		}
	}

}
