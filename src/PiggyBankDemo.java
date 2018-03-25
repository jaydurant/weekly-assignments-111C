
public class PiggyBankDemo {

	public static void main(String[] args) {
		Money[] moneyArr = {
				new Money("nickel",0.05F),
				new Money("dollar",1F),
				new Money("10dollar",10F),
				new Money("twentydollars",20F)
		};
		BagInterface<Money> piggyBank = new PiggyBank<>();
		
		float totalAmount = 0F;
		for(int i = 0 ; i < moneyArr.length ; i++) {
			piggyBank.add(moneyArr[i]);
			totalAmount += moneyArr[i].getAmount();
		}
		
		System.out.println("Total Amount " + totalAmount);
		System.out.println("CurrentSize: " + piggyBank.getCurrentSize());
		
		System.out.println("IsEmpty " + piggyBank.isEmpty());
		totalAmount -= moneyArr[0].getAmount();
		System.out.println("Remove Nickel "+ piggyBank.remove(moneyArr[0]));
		Float removedAmount = piggyBank.remove().getAmount();
		
		totalAmount -= removedAmount;
		
		System.out.println("Frequency of " + piggyBank.getFrequencyOf(moneyArr[1]));
		System.out.println("Contains " + piggyBank.contains(moneyArr[2]));
		
		System.out.println(totalAmount);
		System.out.println(piggyBank.toArray());
		piggyBank.clear();
		System.out.println("Get Size of Bank " + piggyBank.getCurrentSize());
		
		
	}

}
