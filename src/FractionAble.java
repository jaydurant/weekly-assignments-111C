
public interface FractionAble {
	public Fraction addFractions(Fraction fraction2);
	
	public Fraction subtractFractions(Fraction fraction2);
	
	public Fraction multiplyFractions(Fraction fraction2);
	
	public Fraction divideFractions(Fraction fraction2);
	
	public Fraction findReciprocal(Fraction fraction);
	
	public String toString();
	
	public Integer compare( Fraction fraction2);
	
	public Integer gcd(Integer one, Integer two);
}
