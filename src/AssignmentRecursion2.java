import java.util.*;
public class AssignmentRecursion2 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
	}
	
	public static int computeTenToThe(int n) {
		if(n == 1) {
			return 10;
		}else {
			return 10 * computeTenToThe(n - 1);
		}
	}
}




