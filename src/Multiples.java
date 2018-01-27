import java.util.*;
public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		Float inputFloat = input.nextFloat();
		
		System.out.println("Select an option");
		System.out.println("a - First 5 multiples");
		System.out.println("b - Squares of first 5 multiples");
		System.out.println("c - Cubes of first five multiples.");
		
		String selectedOpt = input.next();
		
		float[] floatArr = new float[5];
		
		for(int i = 0 ;i < 5; i++){
			floatArr[i] = (i + 1) * inputFloat;
		}
		
		switch(selectedOpt) {
			case "a":
				for(int i = 0; i < 5; i++) {
					System.out.println(floatArr[i]);
				}
				break;
			case "b":
				for(int i = 0 ;i < 5; i++) {
					System.out.println(Math.pow(floatArr[i], 2));
				}
				break;
			case "c":
				for(int i = 0 ; i< 5 ; i++) {
					System.out.println(Math.pow(floatArr[i], 3));
				}
		}
		

	}

}
