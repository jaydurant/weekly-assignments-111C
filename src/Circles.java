import java.util.*;

public class Circles {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please give me the radius:");
		
		Float radius = input.nextFloat();
		
		double area = Math.PI * Math.pow(radius, 2);
		double circumference = Math.PI * radius * 2;
		
		System.out.println("Area of the Cirlce " + area );
		System.out.println("Circumference of the Circle " + circumference);
		
	}

}
