import java.util.Arrays;

public class AssignmentBinarySearch1 {

	public static void main(String[] args) {
		int[] intArr = {6,5,4,2,1,0};
		selectionSort(intArr);
		binarySearch(intArr,5);
	}
	
	public static void selectionSort(int[] intArr) {
		for(int i = 0 ; i < intArr.length - 1 ; i++ ) {
			int minIndex = i;
			
			for(int y = i ; y < intArr.length; y++) {
				if(intArr[y] < intArr[minIndex]) {
					minIndex = y;
				}
			}
			
			int temp = intArr[minIndex];
			intArr[minIndex] = intArr[i];
			intArr[i] = temp;
		}
	}
	
	public static void binarySearch(int[] intArr, int data) {
		int lBound = 0;
		int uBound = intArr.length - 1;
		int mid = 0;
		boolean found = false;
		
		while(lBound <= uBound && !found) {
			mid = (lBound + uBound) / 2;
			if(data > intArr[mid]) {
				lBound = ++mid;
			}
			else if(data < intArr[mid]) {
				uBound = --mid;
			}else {
				found = true;
			}
			
		}
		
		if(found) {
			System.out.println("Found " + data + " at " + mid );
			System.out.println(Arrays.toString(intArr));
		}else {
			System.out.println("Not Found " + data);
		}
	}
	
	

}
