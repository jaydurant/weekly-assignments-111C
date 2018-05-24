package huge;

public class HugeTester 
{
	public static void main(String[] args) 
	{
		Huge x = new Huge();
		Huge y = new Huge("1000000000000");
		y.displayLargeInt();
		System.out.println(y.stringLargeInt());
		x.setLargeInt("5000000000000");
		x.displayLargeInt();
		x.readLargeInt();
		x.displayLargeInt();
		Huge sum = Huge.addHugeInt(x, y);
		System.out.println(sum.stringLargeInt() + " sum" );
		Huge product = Huge.multiplyHugeInt(x, y);
		System.out.println(product.stringLargeInt());
	}
}
