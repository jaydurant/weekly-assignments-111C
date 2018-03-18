
public class Fraction implements FractionAble{
	private Integer numerator;
	private Integer denominator;
	
	public Fraction(Integer numerator, Integer denominator) {
		Integer gcdenom = gcd(numerator, denominator);
			this.numerator = numerator / gcdenom;
			this.denominator = denominator / gcdenom;
		
	}
	
	public Fraction addFractions( Fraction fraction2) {
		Fraction newFraction1 = new Fraction(this.getNumerator() * fraction2.getDenominator(), this.getDenominator() * fraction2.getDenominator() );
		Fraction newFraction2 = new Fraction(fraction2.getNumerator() * this.getDenominator(), fraction2.getDenominator() * this.getDenominator());
	
		Integer newNum = newFraction1.getNumerator() +  newFraction2.getNumerator();
		Integer newDenom = newFraction2.getDenominator();
		return new Fraction(newNum, newDenom);
	}
	
	public Fraction multiplyFractions(Fraction fraction2) {
		Integer newNumerator = this.getNumerator() * fraction2.getNumerator();
		Integer newDenominator = this.getDenominator() * fraction2.getDenominator();
		
		return new Fraction(newNumerator, newDenominator);
	}
	
	public Integer compare(Fraction fraction2) {
		Fraction newFraction1 = new Fraction(this.getNumerator() * fraction2.getDenominator(), this.getDenominator() * fraction2.getDenominator() );
		Fraction newFraction2 = new Fraction(fraction2.getNumerator() * this.getDenominator(), fraction2.getDenominator() * this.getDenominator());
		
		if(newFraction1.getNumerator() > newFraction2.getNumerator()) {
			return 1;
		}
		else if(newFraction1.getNumerator() < newFraction2.getNumerator()){
			return -1;
		}
		
		return 0;
	}
	
	public Fraction findReciprocal(Fraction fraction) {
		return new Fraction(fraction.getDenominator(), fraction.getNumerator());
	}
	
	public Fraction divideFractions(Fraction fraction2) {
		Fraction reverseFrac = findReciprocal(fraction2);
		Integer newNumerator = this.getNumerator() * reverseFrac.getNumerator();
		Integer newDenominator = this.getDenominator() * reverseFrac.getDenominator();
		
		return new Fraction(newNumerator, newDenominator);
	}
	
	public Fraction subtractFractions(Fraction fraction2) {
		
		Fraction newFraction1 = new Fraction(this.getNumerator() * fraction2.getDenominator(), this.getDenominator() * fraction2.getDenominator() );
		Fraction newFraction2 = new Fraction(fraction2.getNumerator() * this.getDenominator(), fraction2.getDenominator() * this.getDenominator());
	
		Integer newNum = newFraction1.getNumerator() - newFraction2.getNumerator();
		Integer newDenom = newFraction2.getDenominator();
		return new Fraction(newNum, newDenom);
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public Integer gcd(Integer one, Integer two) {
		Integer result;
		if(one % two == 0) {
			return two;
		}else {
			result = gcd(two, one % two);
		}
		
		return result;
	}

	public Integer getNumerator() {
		return numerator;
	}

	public void setNumerator(Integer numerator) {
		this.numerator = numerator;
	}

	public Integer getDenominator() {
		return denominator;
	}

	public void setDenominator(Integer denominator) {
		this.denominator = denominator;
	}
	
	
}
