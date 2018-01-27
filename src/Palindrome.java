import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int inputInt = input.nextInt();
		int originInt = inputInt;
		int reversedInt = 0;
		
		while(inputInt > 0) {
			int tempInt = inputInt % 10;
			reversedInt = reversedInt * 10 + tempInt;
			inputInt /= 10;
		}
		
		if(originInt == reversedInt) {
			System.out.println(originInt + " is a Palindrome");
		}else {
			System.out.println( originInt + " is not a Palindrome");
		}
	}

}
