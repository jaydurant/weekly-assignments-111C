import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0;i < 5; i++) {
			System.out.println("Enter Integer");
			intArr[i] = input.nextInt();
		}
		
		System.out.println("Original " + Arrays.toString(intArr));
		selectionSort(intArr);
		System.out.println("Sorted " + Arrays.toString(intArr));
	}
	
	
	public static void selectionSort(int[] intArr) {
		for(int i = 0; i < intArr.length - 1 ; i++) {
			int min = i;
			for(int y = i + 1; y < intArr.length ;y++) {
				if(intArr[y] < intArr[min]) {
					min = y;
				}
			}
			
			int temp = intArr[i];
			intArr[i] = intArr[min];
			intArr[min] = temp;
		}
	}

}
