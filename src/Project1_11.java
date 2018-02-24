import java.util.*;
public class Project1_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = input.nextInt();
		ArrayList<Integer> intArr = splitInt(num);
		displayA(intArr);
		
		ArmStrong(intArr,num);
		reverseNumber(intArr);
		
		System.out.println("Enter 2 numbers");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		highestCommonFactor(num1, num2);
		lowestCommonMultiple(num1, num2);
		
		System.out.println("Ranges of " + num1 );
		rangeSumEvenNumbers(num1);
		rangeSumOddNumbers(num1);
		
		

	}
	
	public static ArrayList<Integer>  splitInt(int num) {
		ArrayList<Integer> arrList = new ArrayList<>();
		
		while(num > 0) {
			int i = num % 10;
			arrList.add(i);
			num /= 10;
		}
		
		return arrList;
	}
	
	public static void displayA(ArrayList<Integer> intArr) {
		int sumEven = 0;
		int totalNumberEvenDigits = 0;
		int sumOdd = 0;
		int totalNumberOddDigits = 0;
		
		for(Integer val : intArr) {
			if(val % 2 == 0) {
				sumEven += val;
				totalNumberEvenDigits++;
			}else {
				sumOdd +=val;
				totalNumberOddDigits++;
			}
		}
		
		System.out.println(sumEven);
		System.out.println(totalNumberEvenDigits);
		System.out.println(sumOdd);
		System.out.println(totalNumberOddDigits);
	}
	
	public static void ArmStrong(ArrayList<Integer> intArr,int num) {
		int sum = 0;
		for(Integer val: intArr) {
			sum += Math.pow(val,3);
		}
		
		if(sum == num) {
			System.out.println(num + " Number is Armstrong");
		}else {
			System.out.println(num + " Number is not Armstrong");
		}
	}
	
	public static void reverseNumber(ArrayList<Integer> intArr) {
		int reverse = 0;
		for(Integer val : intArr) {
			reverse *= 10;
			reverse += val;
		}
		
		System.out.println("Reverse is : " + reverse);
	}
	
	public static void highestCommonFactor(int x, int y) {
		int factor = 0;
		int small;
		if(x > y) {
			small = y;
		}else {
			small =x;
		}
		
		for(int i = 1; i < small + 1 ; i++) {
			if(x % i == 0 && y % i == 0) {
				factor = i;
			}
		}
		
		System.out.println("Highest Common Factor : " + factor);
	}
	
	public static void lowestCommonMultiple(int x, int y) {
		int multiple = 0;
		int large;
		if(x > y) {
			large = x;
		}else {
			large =y;
		}
		
		boolean isLooping = true;
		while(isLooping) {
			if(large % x == 0 && large % y == 0 ) {
				multiple = large;
				isLooping = false;
			}
			
			large++;
		}
		
		
		System.out.println("LowestCommonMultiple : " + multiple);
	}
	
	public static void rangeSumEvenNumbers(int n) {
		int num = 0;
		
		for(int i = 1;i <= n;n++) {
			if(i % 2 == 0) {
				num += i;
			}
		}
		
		System.out.println("Sum of Even Numbers is " + num );
	}
	
	public static void rangeSumOddNumbers(int n) {
		int num = 0;
		
		for(int i = 1;i <= n;n++) {
			if(i % 2 != 0) {
				num += i;
			}
		}
		
		System.out.println("Sum of Odd Numbers is " + num );
	}
}
