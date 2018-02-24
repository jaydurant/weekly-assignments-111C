import java.util.Arrays;

public class AssignmentInsertionSort4 {

	public static void main(String[] args) {
		int [] intArr = {50,20,30,7,15,10,17,36};
		
		insertionSort(intArr);
	}


	public static void insertionSort(int[] intArr) {
		System.out.println(Arrays.toString(intArr));
		int temp;
		int j;
		for(int i = 1; i < intArr.length; i++ ) {
			temp = intArr[i];
			j = i - 1;
			
			while(j >= 0 && temp < intArr[j] ) {
				intArr[j + 1] = intArr[j];
				j--;
			}
			
			intArr[j + 1] = temp;
			System.out.println(Arrays.toString(intArr));
		}
	}
}
