import java.util.*;
public class AssignmentDeletetion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] doubleArr = new double[5];
		
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.println("Enter a number");
			doubleArr[i] = input.nextDouble();
		}
		
		System.out.println("Enter double to delete");
		double number = input.nextDouble();
		for(int i= 0; i < doubleArr.length;i++) {
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println(" ");
		deleteData(doubleArr, number);

	}
	
	
	public static void deleteData(double[] doubleArr, double data) {
		int foundIndex = 0;
		boolean isNotFound = true;
		
		for(int i = 0 ; i < doubleArr.length && isNotFound  ; i++) {
			if(doubleArr[i] == data) {
				foundIndex = i;
				isNotFound = false;
			}
		}
		
		for(int y = foundIndex; y < doubleArr.length - 1; y++) {
			doubleArr[y] = doubleArr[y + 1];
		}
		
		for(int i= 0; i < doubleArr.length - 1 ;i++) {
			System.out.print(doubleArr[i] + " ");
		}
	}
}
