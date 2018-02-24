import java.util.*;

public class Project1_10 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Number");
			
			int number = input.nextInt();
			
			System.out.println("1 - First Five Multiples");
			System.out.println("2 - Squares of First 5 Multiples");
			System.out.println("3 - Cubes of First 5 Multiples");
			
			int choice = input.nextInt();
			switch(choice) {
				case 1:
					first5Multiples(number);
					break;
				case 2:
					square5Multiples(number);
					break;
				case 3:
					cube5Multiples(number);
					break;
			}
	}
	
	public static void first5Multiples(int num) {
		for(int i = 1; i <= 5;i++) {
			System.out.println(num * i);
		}
	}
	
	public static void square5Multiples(int num) {
		for(int i = 1; i <= 5 ;i++) {
			System.out.println(Math.pow(num * i, 2));
		}
	}
	
	public static void cube5Multiples(int num) {
		for(int i  = 1; i <= 5; i++) {
			System.out.println(Math.pow(num * i, 3));
		}
	}

}
