import java.util.*;
public class Project1_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter terms");
		
		int terms = input.nextInt();

	}
	
	public static void findSumFib(int n) {
		if (n == 0) {
			System.out.println(0);
			return;
		}
		
		if(n == 1) {
			System.out.println(1);
			return;
		}		
		
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(0);
		intArr.add(1);
		
		for(int i = 2 ; i < n; i++) {
			 intArr.add(intArr.get(i - 1) + intArr.get(i - 2));
		}
		
		int sum = 0;
		for(Integer val: intArr) {
			sum += val;
		}
		
		System.out.println(sum);
	}

}
