import java.util.Scanner;
public class AssignmentRecurssion3 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int exponent= input.nextInt();
		if(exponent < 0) {
			double result = 1.0 / computeTenToThe(exponent);
			System.out.println(result);
		}else {
			System.out.println(computeTenToThe(exponent));
		}
		
	}
	
	public static int computeTenToThe(int n) {
		int returnValue = 10;
		if(n == 0) {
			return 10;
		}else if(n > 1) {
			returnValue =  10 * computeTenToThe(n - 1);
		}else if(n < -1) {
			returnValue =  10 * computeTenToThe(n + 1);
		}
		return returnValue;
	}
}
