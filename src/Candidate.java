import java.util.*;
public class Candidate {
	private int Cno;
	private String Cname;
	private int Score;
	
	public void Enter() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Cno");
		Cno = input.nextInt();
		Cname = input.next();
		Score = input.nextInt();
	}
	
	public void Display() {
		System.out.println("Cno:" + Cno + ", Cname:" + Cname + ", Score: " + Score);
	}
	
	public int RScore() {
		return Score;
	}
	
}
