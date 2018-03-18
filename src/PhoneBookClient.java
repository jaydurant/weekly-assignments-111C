
public class PhoneBookClient {

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		ListingPerson[] lp = new ListingPerson[5];
		String[] names = {"allen","barbara","carl","damon","mike"};
		Long[] numbers = {1312312L,81893232L,644224112L,9138131L,19273192L};
		
		for(int i = 0 ; i < names.length ; i++) {
			lp[i] = new ListingPerson(names[i],numbers[i]);
		}
		pb.setListings(lp);
		
		pb.findListing("mike");
		
		pb.findListing("jason");
	}

}
