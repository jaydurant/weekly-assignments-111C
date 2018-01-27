import java.util.*;
public class Dollars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please insert your dollar amount: $");
		Float amount = input.nextFloat();
		Integer dollarAmount = amount.intValue();
		Float cents = amount - dollarAmount.floatValue();

		int centsValue = Math.round(cents * 100F);
		int tensAmount = dollarAmount/10;
		int fiveAmount = (dollarAmount - (tensAmount * 10)) / 5;
		int singleAmount = dollarAmount - (tensAmount * 10) - (fiveAmount * 5);
		
		int fiftyCents = centsValue / 50;
		int quarterCents = (centsValue - (fiftyCents * 50)) / 25;
		int dimeCents = (centsValue - (fiftyCents * 50) - (quarterCents * 25)) / 10;
		int pennyCents = centsValue - (fiftyCents * 50) - (quarterCents * 25) - (dimeCents * 10);
		
		System.out.println("$10=" + tensAmount);
		System.out.println("$5=" + fiveAmount);
		System.out.println("$1=" + singleAmount);
		System.out.println("50 cents=" + fiftyCents);
		System.out.println("Quarters=" + quarterCents);
		System.out.println("Dimes=" + dimeCents);
		System.out.println("Cents=" + pennyCents);
		

	}

}
