
public class Circle implements Measurable {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getperimeter() {
		return Math.PI * radius * 2;
	}
	
	public double getarea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
