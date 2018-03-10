
public class Square implements Measurable {
	private double sideLength;
	
	public Square (double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getarea() {
		return Math.pow(sideLength, 2);
	}
	
	public double getperimeter() {
		return sideLength * 4;
	}
}
