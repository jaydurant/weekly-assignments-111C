import java.util.*;
public class Book {
	private int Bno;
	private String Bname;
	private String Author;
	private float Price;
	
	public void Enter() {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter Bno");
		this.Bno = input.nextInt();
		System.out.println("Enter Bname");
		this.Bname = input.next();
		System.out.println("Enter Author");
		this.Author = input.next();
		System.out.println("Enter price");
		this.Price = input.nextFloat();
	}
	
	public void Display() {
		System.out.println("Bno:" + Bno + ", Bname:"+ Bname + ", Author:" + Author + ", Price:" + Price);
	}
	
	public int RBno() {
		return Bno;
	}
	
	public String RBname() {
		return Bname;
	}
	
	
}
