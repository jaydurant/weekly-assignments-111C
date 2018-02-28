import java.util.Arrays;

public class AssignmentBinarySearch2 {

	public static void main(String[] args) {
			int[] intArr = {0,1,2,3,5,6};
			insertionSort(intArr);
			binarySearch(intArr,5);

	}

	public static void insertionSort(int[] intArr) {
		int temp;
		int j;
		
		for(int i = 1; i < intArr.length; i++) {
			temp = intArr[i];
			j = i - 1;
			
			while(j >= 0 && temp > intArr[j]) {
				intArr[j + 1] = intArr[j];
				j--;
			}
			
			intArr[j + 1]  = temp;
		}
		
	}
	
	public static void binarySearch(int[] intArr, int data) {
		int lBound = 0;
		int uBound = intArr.length - 1;
		int mid = 0;
		boolean found = false;
		
		while(lBound <= uBound && !found) {
			mid = (lBound + uBound) / 2;

			if(data < intArr[mid]) {
				lBound = ++mid;
			}
			else if(data > intArr[mid]) {
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
