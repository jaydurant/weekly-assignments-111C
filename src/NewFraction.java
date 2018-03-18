
public class NewFraction {

	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(5,8);
		Fraction fraction2 = new Fraction(10,12);
		
		Fraction addedFraction = fraction1.addFractions(fraction2);
		Fraction multiplyFraction = fraction1.multiplyFractions(fraction2);
		Integer compareFraction = fraction1.compare(fraction2);
		Fraction subtractFraction = fraction1.subtractFractions(fraction2);
		Fraction divideFraction = fraction1.divideFractions(fraction2);
		
		System.out.println("Fraction1: "+ fraction1.toString() + " Fraction2: " + fraction2.toString());
		System.out.println(addedFraction.toString() + " Added Fraction");
		System.out.println(multiplyFraction.toString() + " Multiply Fraction");
		System.out.println(compareFraction.toString() + " Compare");
		System.out.println(divideFraction.toString() + " Divided Fraction");
		System.out.println(subtractFraction.toString() + " Subtract Fraction");
	}

}
