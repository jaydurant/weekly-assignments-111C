import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Sorting1Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = input.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " integers for array");
		for(int i = 0; i < size; i++) {	
			arr[i] = input.nextInt();
		}
		
		System.out.println( "Unsorted: " + Arrays.toString(arr));
		smallestIntFirst(arr);
		System.out.println("SmallFirst: " + Arrays.toString(arr));
			
	}

	public static void smallestIntFirst(int[] arr) {
		int minIndex = 0;
		
		for(int i = 1; i < arr.length ;i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;		
			}
		}
		
		int temp = arr[minIndex];
		arr[minIndex] = arr[0];
		arr[0] = temp;
		
	}
}
