import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<>();
		
		System.out.println("Input Number");
		Integer inputInt = input.nextInt();
		int sum = 0;
		
		while(inputInt > 0) {
			int tempInt = inputInt % 10;
			intList.add(tempInt);
			inputInt /= 10;
		}
		
		for(Integer val : intList) {
			sum += val;
		}
		
		System.out.println("Sum " + sum);
	}

}
