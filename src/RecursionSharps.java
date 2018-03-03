import java.util.*;
public class RecursionSharps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		displaySharps(input.nextInt());
	}
	
	public static void displaySharps(int n) {
		if(n < 1) {
			System.out.println();
		}else {
			System.out.print("#");
			displaySharps(n-1);
		}
	}

}
