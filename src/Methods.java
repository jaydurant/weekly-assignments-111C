import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int testInt = input.nextInt();
		
		System.out.println("Composite " + COMPOSITE(testInt));
		
		System.out.println("Digit Count " + COUNT(testInt));
		
		System.out.println("POWER " + POWER(testInt,3));
		
	}
	
	public static int COMPOSITE(int number) {
		
		if(number > 1){
			for(int i = 2; i < number; i++) {
				if(number % i == 0){
					return 1;
				}
			}
			return 0;
		} else {
			return 1;
		}
	}
	
	public static int COUNT(int number) {
		if(number == 0) return 1;
		int count = 0;
		while(number > 0){
			number /= 10;
			count++;
		}
		
		return count;
	}
	
	public static long POWER(int number, int pow){
		if(pow == 0) return 0;
		long result = 1;
		
		for(int i = 0; i < pow; i++) {
			result *= number;
		}
		
		return result;
	}

}
