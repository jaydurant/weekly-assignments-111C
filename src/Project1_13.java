import java.util.*;
public class Project1_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Terms and X");
		Integer terms = input.nextInt();
		Integer x = input.nextInt();
		
		sumOfTerms(terms, x);
		
	}
	
	public static void sumOfTerms(int terms, int x) {
		int sum = 0;
		
		for(int i = 1; i <= terms ; i++) {
			sum += Math.pow(x,i);
		}
		System.out.println("sum" + sum);
	}

}
