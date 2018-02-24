import java.util.*;
public class Project1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows");
		int num = input.nextInt();
		displayRows(num);
	}
	
	
	public static void displayRows(int num) {
		for(int i = 1; i <= num;i++) {
			for(int y = 1; y<= i; y++) {
				System.out.print(y);
			}
			System.out.print("\n");
		}
		
		for(int i = num; num > 0;i--) {
			for(int y = num; num > 0; y++) {
				System.out.print(y);
			}
			System.out.print("\n");
		}
	}

}
