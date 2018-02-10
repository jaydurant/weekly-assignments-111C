import java.util.Arrays;
import java.util.Scanner;

public class Sorting1Problem3 {

	public static void main(String[] args) {
		int[] arr = {45,32,12,26,15,35,10,17};
		
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("Iteration " + i + Arrays.toString(arr));
		}
	}

}
