import java.util.Arrays;

public class ContentsSelectionSort {

	public static void main(String[] args) {
		int[] intArr = {55,32,12,46,15,27,7,30};
		System.out.println(Arrays.toString(intArr));
		selectionSort(intArr);

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
			
			System.out.println(Arrays.toString(intArr));
		}
	}

}
