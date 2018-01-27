import java.util.*;
public class Mileage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your mileage");
		int mileage = input.nextInt();
		System.out.print("Please enter your class");
		int fareClass = input.nextInt();
		float cost = 0;
		
		if(fareClass == 1) {
			if(mileage <= 100) {
				cost += mileage * 3;
			}
			else if(mileage <= 250) {
				cost += 300 + (mileage - 100) * 2;
			}else {
				cost += 600 + (mileage - 250) * 1.5 ;
			}
		}else if(fareClass == 2) {
			if(mileage <= 100) {
				cost += mileage * 2.5;
			}
			else if(mileage <= 250) {
				cost += 250 + (mileage - 100) * 1.5 ;
			}else {
				cost += 475 + (mileage - 250);
			}
		}else {
			if(mileage <= 100) {
				cost += mileage * 2;
			}
			else if(mileage <= 250) {
				cost += 200 + (mileage - 100);
			}else {
				cost += 350 + (mileage - 250) * .5 ;
			}
		}
		
		
		System.out.println("Fare of journey $" + cost );
		
	}

}
