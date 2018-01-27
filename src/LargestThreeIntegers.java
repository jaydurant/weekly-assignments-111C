import java.util.*;
public class LargestThreeIntegers {
	private final static int NUMBER_VALUES = 3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int[] intArr = new int[NUMBER_VALUES];
		while(count < NUMBER_VALUES) {
			System.out.println("Please enter a number:");
			int value = input.nextInt();
			intArr[count] = value;
			count++;
		}
		
		int max = intArr[0];
		
		for(int i = 0; i < intArr.length; i++){
			if(intArr[i ] > max) {
				max = intArr[i];
			}
		}
		
		System.out.println("The largest number is " + max);
	}

}
