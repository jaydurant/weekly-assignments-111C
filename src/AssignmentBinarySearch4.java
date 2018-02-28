import java.util.Arrays;

public class AssignmentBinarySearch4 {

	public static void main(String[] args) {
		int [] intArr = {5,2,4,1};
		System.out.println("Original");
		System.out.println(Arrays.toString(intArr));
		shellSort(intArr);
		System.out.println("Sorted");
		System.out.println(Arrays.toString(intArr));
	}
	
	public static void shellSort(int[] intArr) {
		int n = intArr.length;
		
		for(int gap = n/2; gap > 0 ; gap /= 2) {
			for(int i = gap; i < n; i++) {
				int temp = intArr[i];
				
				int j;
				for(j = i; j >= gap && intArr[j - gap] > temp; j -= gap) {
					intArr[j] = intArr[j-gap];
				}
				
				intArr[j] = temp;
			}
		}
	}
}
