import java.util.*;

public class Sorting1Problem1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = input.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter integer for array");
			arr[i] = input.nextInt();
		}
		
		System.out.println( "Unsorted: " + Arrays.toString(arr));
		System.out.println("Sorted: " + Arrays.toString(bubbleSort(arr)));
	}
	
	public static int[]  bubbleSort(int[] intArr) {
		for(int i = 0 ; i < intArr.length - 1; i++) {
			for(int j = 0 ; j < intArr.length - 1 - i ; j++) {
				if(intArr[j] > intArr[j + 1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
				}
			}
		}
		
		return intArr;
	}

}
