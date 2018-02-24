import java.util.*;
public class CandidateMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Candidates");
		ArrayList<Candidate> candidates = Enroll();
		
		Sort(candidates);
		getPass(candidates);
	}
	
	public static ArrayList<Candidate> Enroll() {
		ArrayList<Candidate> candArr = new ArrayList<>();
		System.out.println("Enter 3 Candidates");
		for(int i = 0 ; i < 3; i++) {
			Candidate cand = new Candidate();
			cand.Enter();
			candArr.add(cand);
		}
		
		return candArr;
	}
	
	public static ArrayList<Candidate> Sort(ArrayList<Candidate> candArr) {
		for(int i = 0; i < candArr.size() - 1; i++) {
			for(int y = i + 1; y < candArr.size() - 1 - i; i++) {
				if(candArr.get(y).RScore() < candArr.get(y + 1).RScore()) {
					
					Candidate temp = candArr.get(y);
					candArr.set(y,candArr.get(y+1));
					candArr.set(y+1, temp);
				}
			}
			
			
		}
		
		for(Candidate cand: candArr) {
			cand.Display();
		}
		
		return candArr;
	}
	
	public static void getPass(ArrayList<Candidate> candArr) {
		for(Candidate cand : candArr) {
			if(cand.RScore() >= 33) {
				cand.Display();
			}
		}
	}
	
}
