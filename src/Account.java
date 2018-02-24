import java.util.*;

public class Account {
	private int Acno;
	private String Name;
	private Float Balance;
	
	public void Init() {
		Scanner input = new Scanner(System.in);
		Acno = input.nextInt();
		Name = input.next();
		Balance = input.nextFloat();
	}
	
	public void Show() {
		System.out.println("Acno:" + Acno + ", Name:" + Name + ", Balance: " + Balance);
	}
	
	public void Deposit(int Amt) {
		Balance += Amt;
	}
	
	public void Withdraw(int Amt) {
		if(Balance != null) {
			Balance += Amt;
		}
	}
	
	public float RBalance() {
		return Balance;
	}
	
	public int RAcno() {
		return Acno;
	}
}
