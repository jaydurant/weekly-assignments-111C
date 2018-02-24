import java.util.*;
public class AssignmentInsertionString {

	public static void main(String[] args) {
		String[] stringArr = {"hello","carr","dog","rabbit"};
		System.out.println("Unsorted");
		System.out.println(Arrays.toString(stringArr));
		insertionSort(stringArr);
		System.out.println("Sorted");
		System.out.println(Arrays.toString(stringArr));

	}
	
	
	public static void insertionSort(String[] stringArr) {
		String temp;
		int j;
		for(int i = 1; i < stringArr.length; i++ ) {
			temp = stringArr[i];
			j = i - 1;
			
			while(j >= 0 && temp.compareTo(stringArr[j]) < 0  ) {
				stringArr[j + 1] = stringArr[j];
				j--;
			}
			
			stringArr[j + 1] = temp;
		}
	}

}
