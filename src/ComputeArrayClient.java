import java.util.*;
public class ComputeArrayClient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Add 5 Integers to Array");
		ComputeArray cpArr = new ComputeArray();
		
		for(int i = 0 ; i < 6; i++) {
			int integer = input.nextInt();
			cpArr.addToArray(integer);
			
			if(i > 1) {
				System.out.println("Smallest " + cpArr.computeSmallest() );
				
				System.out.println("Second Smallest " + cpArr.computeSecondSmallest());
				
				System.out.println("Average " + cpArr.averageOfArray());
				
			}
		}

	}

}
