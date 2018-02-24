import java.util.*;

public class Project1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input N Terms");
		int n = input.nextInt();
		
		System.out.println("SumTerms: " + sumNTerms(n));
		System.out.println("SquareTerms: " + squareNTerms(n));
		System.out.println("CubeNTerms: "+ cubeNTerms(n));
	}
	
	public static int sumNTerms(int n) {
		int sum = 0;
		for(int i = 0, y = 1 ; i < n; i++) {
			sum += y;
			y += 2;
		}
		
		return sum;
	}
	
	public static long squareNTerms(int n) {
		long sum = 0;
		for(int i = 0, y = 2; i < n ; i++) {
			sum += Math.pow(y, 2);
			y += 2;
		}
		
		return sum;
	}
	
	public static long cubeNTerms(int n) {
		long sum = 0;
		
		for(int i = 0, y = 1 ; i < n;i++) {
			sum += Math.pow(y, 3);
			y += 2;
		}
		
		return sum;
	}

}
