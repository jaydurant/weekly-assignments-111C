import java.util.*;
public class AssignmentInsert {

	public static void main(String[] args) {
		int size = 4;
		Scanner input = new Scanner(System.in);
		int[] intArr = new int[5];
		for(int i = 0; i  < size ; i++) {
			System.out.println("Enter number");
			intArr[i] = input.nextInt();
		}
		
		System.out.println("Enter data");
		int data = input.nextInt();
		System.out.println("Enter loc between 1 and 5");
		int loc = input.nextInt();
		System.out.println("Old Arr");
		for(int i = 0;i < 4; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println("\nNewArr");
		insertNumber(intArr,size,data,loc);
		
	}
	
	public static void insertNumber(int[] intArr, int size,int data, int loc) {
		if(size + 1 > intArr.length) {
			System.out.println("Array too small");
			return;
		}
		else if(loc >= 1 && loc <= size + 1) {
			for(int i = size - 1 ; i >= loc - 1 ; i--) {
				intArr[i + 1] =  intArr[i];
			}
			
			intArr[loc - 1 ] = data;
			
			for(int i = 0 ; i < size + 1; i++) {
				System.out.print(intArr[i] + " ");
			}
		}
	}

}
