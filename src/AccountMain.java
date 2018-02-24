import java.util.*;
public class AccountMain {
	private static ArrayList<Account> arrAccts;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean active = true;
		
		do {
			System.out.println("What would you like to do?");
			System.out.println("1 Register 3 Accounts");
			System.out.println("2 Withraw or Deposit");
			System.out.println("3 Display all accounts");
			
			int choice = input.nextInt();
			
			selectedMenuChoice(choice,input);
			
			System.out.println("Would you like to exit? y/n");
			active = input.next().equals("n");
		}while(active);
	}
	
	public static void methodRegister() {
		ArrayList<Account> actArr = new ArrayList<>();
		System.out.println("Enter 3 Accounts");
		for(int i = 0 ; i < 3; i++) {
			Account act = new Account();
			act.Init();
			actArr.add(act);
		}
		
		arrAccts = actArr;
	}
	
	public static void methodTransact(int accNumber, String type, int amt) {
		Account act = null;
		for(Account account : arrAccts) {
			if(account.RAcno() == accNumber) {
				act = account;
			}
		}
		
		if(act.RBalance() <= 500) {
			System.out.println("You must maintain a minimum balance of 500");
			return;
		}
		
		if(type.equals("withdraw")) {
			act.Withdraw(amt);
		}
		
		if(type.equals("deposit")) {
			act.Deposit(amt);
		}
	}
	
	public static void DisplayAll() {
		for(Account act : arrAccts) {
			act.Show();
		}
	}
	
	public static void selectedMenuChoice(int choice,Scanner input) {
		switch(choice) {
		case 1:
			methodRegister();
			break;
		case 2:
			if(arrAccts.size() == 0) {
				System.out.println("Please enter in accounts");
			}else {
				System.out.println("Enter Acc Id");
				int id = input.nextInt();
				System.out.println("Withdraw or Deposit: w/d");
				String withdrawOrDeposit = input.next().equals("w") ? "withdraw" : "deposit";
				System.out.println("Enter Amount");
				int amt = input.nextInt();
				methodTransact(id,withdrawOrDeposit,amt);
			}
			break;
		case 3:
			DisplayAll();
			break;
		}
	}

}
