import java.util.*;


public class Item {
	private int I_no;
	private String I_name; 
	private float I_price;
	private int I_qty;
	private double I_cost;
	
	public Item(){}
	
	public Item(int I_no, String I_name, float I_price, int I_qty) {
		this.I_no = I_no;
		this.I_name = I_name;
		this.I_price = I_price;
		this.I_qty = I_qty;
		
		Calculate();
	}
	
	public void Display() {
		System.out.println("no " + I_no);
		System.out.println("name " + I_name);
		System.out.println("price " + I_price);
		System.out.println("qty " + I_qty);
		System.out.println("cost " + I_cost);
	}
	
	public double Calculate() {
		return I_price * I_qty;
	}
	
	public void Input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Item Number");
		I_no = input.nextInt();
		System.out.println("Input Item Name");
		I_name = input.next();
		System.out.println("Input Item Price");
		I_price = input.nextFloat();
		System.out.println("Input Item Qty");
		I_qty = input.nextInt();
		Calculate();
	}
}
