
public class CircleSquareClient {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Square square = new Square(2);
		
		System.out.println("Circle Area: " + circle.getarea());
		System.out.println("Circle Perimeter: " + circle.getperimeter());
		
		System.out.println("Square Area: " + square.getarea());
		System.out.println("Square Perimeter: " + square.getperimeter());

	}

}
