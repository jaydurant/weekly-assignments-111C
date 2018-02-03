import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArr[i] = input.nextInt();
		}
		
		System.out.println("Avg: " + average(intArr));
		System.out.println("MaxMin: " + Arrays.toString(maxMin(intArr)));
		
		System.out.println("Enter number to search");
		int nextInt = input.nextInt();
		linearSearch(intArr, nextInt);
		linearSearchOccurrences(intArr,nextInt);
		System.out.println("Enter number to for replacement and a number to replace");
		int numberForReplacement = input.nextInt();
		int numberReplacer = input.nextInt();
		replaceLinearSearch(intArr,numberForReplacement,numberReplacer);
		

	}
	
	public static double average(int[] intArr) {
		int sum = 0;
		for(int i = 0 ; i < intArr.length ; i++ ) {
			sum += intArr[i];
		}
		
		double avg =  (double)sum/intArr.length;
		
		return avg;
		
	}
	
	public static int[] maxMin(int[] intArr) {
		int max = intArr[0];
		int min = intArr[0];
		
		for(int i = 1; i < intArr.length; i++) {
			if(intArr[i] < min) {
				min = intArr[i];
			} else if(intArr[i] > max) {
				max = intArr[i];
			}
		}
		int[] result = {max,min};
		return result;
	}
	
	public static void linearSearch(int[] intArr,int number){
		boolean found = false;
		int i; 
		for(i = 0 ; i < intArr.length && !found; i++) {
			if(intArr[i] == number) {
				
				found = true;
			}
		}
		
		if(found) {
			System.out.println(number + " Found in Array, Index:" + i);
		}else {
			
		}
		System.out.println("Not Found in Array");
		return;
	}
	
	public static void linearSearchOccurrences(int[] intArr, int number){
		int occurrences = 0;
		for(int i = 0 ; i < intArr.length; i++) {
			if(intArr[i] == number) {
				occurrences++;
			}
		}
		System.out.println(number + " in Array " + occurrences + " times");
		return;
	}
	
	public static void replaceLinearSearch(int[] intArr, int original, int replacement){
		int[] replacementArr = new int[intArr.length];
		
		for(int i = 0 ; i< intArr.length; i++) {
			if(intArr[i] == original) {
				replacementArr[i] = replacement;
			}else {
				replacementArr[i] = intArr[i];
			}
		}
		System.out.println("Original Array :" + Arrays.toString(intArr) );
		System.out.println("Replacement Array :" + Arrays.toString(replacementArr) );
		return;
	}

}
